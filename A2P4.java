package java_Assignments;

public class A2P4 {


		static int findSum(int number)  
		{           
		int sum = 0;   
		while (number != 0)  
		{     
		sum = sum + number % 10;   
		number = number/10;  
		}  
		return sum;  
		}  

		public static void main(String[] args) {
			int number = 8929;  
			
			System.out.println("The sum of digits: "+findSum(number)); 

		}

	}


