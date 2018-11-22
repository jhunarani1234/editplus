import java.util.Scanner;
class S18                                           //2nd pallindrome program

{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a string : ");
		String s =scan.nextLine();
		String rev="";
		
		
		
			for(int i=0;i<s.length();i++)                   //pallindrome 2 of a string  input=enter a string : abba    output=string is a pallindrome :
		{
			rev=s.charAt(i)+rev;
		}
		boolean x=true;
		for(int i=0;i<s.length();i++)
		{
				if(s.charAt(i)!=rev.charAt(i))
		{
			x=false;
			break;
		}
		}
		if(x==true)
			{
			System.out.println("pallindrome ");
			}
			else
			{
				System.out.println("not a pallindrome ");
			}
		
	}
}