import java.util.Scanner;
class S17

{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a string : ");
		String s =scan.nextLine();
		String rev="";
		
		
		
			for(int i=0;i<s.length();i++)                   //pallindrome of a string  input=enter a string : abba    output=string is a pallindrome :
		{
			rev=s.charAt(i)+rev;
		}
		for(int i=0;i<s.length();i++)
		{
				if(s.charAt(i)!=rev.charAt(i))
		{
			System.out.println("string is not a pallindrome : ");
			break;
		}
		
		if(i==s.length()-1)
		{
		
		    System.out.println("string is a pallindrome : " );
		}
		}
		
		
	}
}
		