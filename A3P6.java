package java_Assignments;

public class A3P6 {

	public static void main(String[] args) {
		try{
	         int num1=4, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("cant divide number by zero");
	      }
	}

}
