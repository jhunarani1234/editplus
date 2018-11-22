import java.util.Scanner;
class S1

{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a string : ");
		String s =scan.nextLine();
		String rev="";
		
			for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
		