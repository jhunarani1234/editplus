import java.util.Scanner;
class S3

{
	public static void main(String args[])
	{
		System.out.print("enter n ");

		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++)
		{

		System.out.print("enter a string "+(i+1) );
		String s =scan.nextLine();
		System.out.print("enter a string "+(i+1) );
	     System.out.println(s);
		}
	}
}
	

