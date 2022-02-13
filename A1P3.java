package java_Assignments;
public class A1P3 {
	public static void main(String[] args) {
		int[] a = { 8, 7, 15, 5, 7 };
		int temp = 0;
		
		System.out.println(" the original array is ");// original array printing
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++)// sorting functionality
			{
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("after sorting the array is");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");

		}

	}


}
