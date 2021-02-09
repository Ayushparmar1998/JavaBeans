package in.com.rays.jdbc;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
//		update();
//		 add();
     		delete();
//		 search();
//		   get();
//		meritlist();
	}
//                            add method;
	
	/*  private static void add() throws Exception{ MarksheetBeans m = new
	  MarksheetBeans(); 
	    m.setId(7);
	    m.setfName("water");
	    m.setlName("man");
	    m.setRollNo("rays109");
	    m.setMath(36);
	    m.setPhy(45); 
	    m.setChem(66);
	  
	  MarksheetModel model = new MarksheetModel();
	   model.add(m);
	    }*/
	 
//                                      update method
	 /* private static void update() throws Exception {
		MarksheetBeans m1 = new MarksheetBeans();
		m1.setId(2);
		m1.setfName("shintu");
		m1.setlName("jaiswal");
		m1.setRollNo("rays111");
		m1.setMath(49);
		m1.setPhy(55);
		m1.setChem(96);

		MarksheetModel model = new MarksheetModel();
		model.update(m1);
	}*/
//                                delete method
	
	    private static void delete() throws Exception {
		MarksheetBeans m2 = new MarksheetBeans();
		m2.setId(21);
		MarksheetModel model = new MarksheetModel();
		model.delete(m2);
	}
	
//                              get full row data method	
	
	/* private static void get() throws Exception {
			MarksheetBeans m3 = new MarksheetBeans();
			m3.setRollNo("rays103");
			MarksheetModel model = new MarksheetModel();
			model.get(m3);
}*/
	
//	                        search method by id
	
	/*private static void search() throws Exception {
		MarksheetBeans m4 = new MarksheetBeans();
		m4.setId(5);
		MarksheetModel model = new MarksheetModel();
		model.search(m4);
		}*/
		


//                              getmeritlist 

	/*private static void meritlist() throws Exception {
		MarksheetBeans m5 = new MarksheetBeans();
		   
		MarksheetModel model = new MarksheetModel();
		((MarksheetModel) model).meritlist(m5);
	}*/
}