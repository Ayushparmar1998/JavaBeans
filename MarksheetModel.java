package in.com.rays.jdbc;
import java.sql.*;
public class MarksheetModel {

	//	                              add query
	
public void add(MarksheetBeans beans) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","root");
	conn.setAutoCommit(false);
	PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
	ps.setInt(1, beans.getId());
	ps.setString(2, beans.getfName());
	ps.setString(3, beans.getlName());
	ps.setString(4, beans.getRollNo());
	ps.setInt(5, beans.getMath());
	ps.setInt(6, beans.getPhy());
	ps.setInt(7, beans.getChem());
	ps.executeUpdate();
	conn.commit();
	System.out.println("inserted");
	ps.close();
	conn.close();
}

	//	                              update query
	
	public void update(MarksheetBeans beans) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("update  employee set fName=?,lName=?,rollNo=?,math=?,phy=?,chem=? where id = ?");
		
		ps.setString(1, beans.getfName());
		ps.setString(2, beans.getlName());
		ps.setString(3, beans.getRollNo());
		ps.setInt(4, beans.getMath());
		ps.setInt(5, beans.getPhy());
		ps.setInt(6, beans.getChem());
		ps.setInt(7, beans.getId());
	    ps.executeUpdate();
		conn.commit();
		System.out.println("updated");
		ps.close();
		conn.close();
	}
	//	                              delete query
	
	public void delete(MarksheetBeans beans) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("delete from employee where id =?");
		
		ps.setInt(1, beans.getId());
		ps.setString(2, beans.getfName());
		ps.setString(3, beans.getlName());
		ps.setString(4, beans.getRollNo());
		ps.setInt(5, beans.getMath());
		ps.setInt(6, beans.getPhy());
		ps.setInt(7, beans.getChem());
		ps.executeUpdate();
		conn.commit();
		System.out.println("deleted");
		ps.close();
		conn.close();
	}

//                               get query

public void get(MarksheetBeans beans) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","root");
	PreparedStatement ps = conn.prepareStatement("select * from employee where rollNo=?");
	ps.setString(1, beans.getRollNo());
	ResultSet rs = (ResultSet)ps.executeQuery();
	while(rs.next()){
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
		System.out.println(rs.getInt(5));
		System.out.println(rs.getInt(6));
		System.out.println(rs.getInt(7));
	}
	ps.close();
	conn.close();
}

	//                          search data from marksheet	
	
	public void search(MarksheetBeans beans) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","root");
		PreparedStatement ps = conn.prepareStatement("select * from employee where id=?");
		ps.setInt(1, beans.getId());
		ResultSet rs = (ResultSet)ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getInt(5));
			System.out.println(rs.getInt(6));
			System.out.println(rs.getInt(7));
		}
		ps.close();
		conn.close();
	}
	
//	                           get merit list
	
	public void meritlist(MarksheetBeans beans) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","root");
		PreparedStatement ps = conn.prepareStatement("select * ,(phy+chem+math) as total, (((phy+chem+math)/300)*100) as percentage from marksheet where ((phy+chem+math)/300*100) >= 50 order by percentage desc limit 0,6 ");
		
		ResultSet rs = (ResultSet)ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getInt(5));
			System.out.println(rs.getInt(6));
			System.out.println(rs.getInt(7));
			System.out.println(rs.getInt(8));
			System.out.println(rs.getInt(9)+ "%");
		}
		ps.close();
		conn.close();
	}
}