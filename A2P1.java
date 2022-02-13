package java_Assignments;

public class A2P1 {

	public static void main(String[] args) {
		 int[] arr = {7,4,9,12,22,3};
	        int total = 0;

	        for(int i=0; i<arr.length; i++)
	        {
	        	total = total + arr[i];
	        }
	        int average = total / arr.length;
	        
	      
	        System.out.format("The average is: "+average);
	}

	}


