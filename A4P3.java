package java_Assignments;

import java.util.Hashtable;

public class A4P3 {

	public static void main(String[] args) {
		  Hashtable ht = new Hashtable();
		   
		    ht.put("1","One");
		    ht.put("2","Two");
		    ht.put("3","Three");
		 
		   
		    boolean b1 = ht.containsKey("2");
		    System.out.println("2 exists in Hashtable ? : " + b1);

	}

}
