import java.util.*;
class String2

{
	public static void main(String args[])
	{
		System.out.print("enter a string :");
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		String res="";

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90||s.charAt(i)>=97 && s.charAt(i)<=122)       //removing consonant766yhhggfds
			{
				res=res+(char)(s.charAt(i)+2);
			}
			else
			{
				res=res+s.charAt(i);
			}
		}
		System.out.print(res);
	}
}

