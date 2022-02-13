package java_Assignments;

public class A3P4 {
	public static void main(String[] args) {

	String s1="SDET TRAINING";
	char[] ch=new char[s1.length()];
	for(int i=0;i<s1.length();i++)
	{
		ch[i]=s1.charAt(i);
	}
	for(char c:ch)
	{
		System.out.println(c);
	}
	
	
	char[] c = s1.toCharArray();
	System.out.println(c);

	}

}
