package java_Assignments;

public class A3P7 {

	public static void main(String[] args) {
		try  
		{  
		   int c=30/0;  
		    try  
		    {  
		       
		    }  
		    catch(ArithmeticException e)  
		    { 
		    	System.out.println(e);
		    }  
		}  
		catch(ArithmeticException e1)  
		
		{  
			System.out.println(e1);
		} 

	}

}
