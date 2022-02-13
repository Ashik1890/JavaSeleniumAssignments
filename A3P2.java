package java_Assignments;

public class A3P2 {
	static boolean isPalindrome(String str)
    {
 
        int i = 0, j = str.length() - 1;

        while (i < j)
        {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
 
        return true;
    }
 

    public static void main(String[] args)
    {
        String str = "trurt";
 
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");


	}

}
