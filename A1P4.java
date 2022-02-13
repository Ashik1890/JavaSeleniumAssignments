package java_Assignments;

public class A1P4 {
	long year=2014;

	public static void main(String[] args) {
		A1P4 y1=new A1P4();
		y1.leapyear();
		
		
		
	}
	
	public void leapyear()
	{
		
		if(year!=0)
		{
			if(year%400==0)
			
				System.out.println("This year is a leap year");
			else if(year%100==0)
				System.out.println("This year is not a leap year");
			else if(year%4==0)
				System.out.println("This year is a leap year");
			else
				System.out.println("This year is not a leap year");
		}

	}

}
