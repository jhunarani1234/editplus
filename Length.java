import java.util.Scanner;
class Length

{
	public static void main(String args[])
	{
		String s="abcd";
		int n=0;
		char x;
		try
		{
		for(n=0;true;n++)
		{
		 x=s.charAt(n);          //find the length of string with out ussing length method.
		 System.out.print(x);
		}
		}
		catch(Exception e)
		{
		 System.out.println("String length:="+n);
		}
	}
}