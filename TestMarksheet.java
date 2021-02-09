package in.com.rays.jdbc;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
//		update();
		// add();
     //		delete();
		// search();
//		   get();
		meritlist();
	}
//                            add method;
	/*
	  private static void add() throws Exception{ MarksheetBeans m = new
	  MarksheetBeans(); 
	    m.setId(20);
	    m.setfName("golu");
	    m.setlName("shukla");
	    m.setRollNo("rays123");
	    m.setMath(36);
	    m.setPhy(45); 
	    m.setChem(66);
	  
	  MarksheetModel model = new MarksheetModel();
	   model.add(m);
	    }
	 */
//                                      update method
	/*  private static void update() throws Exception {
		MarksheetBeans m1 = new MarksheetBeans();
		m1.setId(1);
		m1.setfName("shantnu");
		m1.setlName("agrawal");
		m1.setRollNo("rays456");
		m1.setMath(49);
		m1.setPhy(55);
		m1.setChem(96);

		MarksheetModel model = new MarksheetModel();
		model.update(m1);
	}*/
//                                delete method
	/*
	    private static void delete() throws Exception {
		MarksheetBeans m2 = new MarksheetBeans();
		m2.setId(1);
		MarksheetModel model = new MarksheetModel();
		model.delete(m2);
	}*/
	
//                              get full row data method	
	
	/* private static void get() throws Exception {
			MarksheetBeans m3 = new MarksheetBeans();
			m3.setRollNo("rays456");
			MarksheetModel model = new MarksheetModel();
			model.get(m3);
}*/
	
//	                        search method by id
	
	/*private static void get() throws Exception {
		MarksheetBeans m4 = new MarksheetBeans();
		m4.setId(2);
		MarksheetModel model = new MarksheetModel();
		model.search(m4);
		}*/
		


//                              getmeritlist 

	private static void meritlist() throws Exception {
		MarksheetBeans m5 = new MarksheetBeans();
		   
		MarksheetModel model = new MarksheetModel();
		((MarksheetModel) model).meritlist(m5);
	}
}