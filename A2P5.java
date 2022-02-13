package java_Assignments;

public class A2P5 {

	public static void main(String[] args) {
		int num = 7365, reversed = 0;
	    while(num != 0) {

	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);

	}

}
