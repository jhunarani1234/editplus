import java.util.Scanner;
class S9

{
	public static void main(String args[])
	{
		//System.out.print("enter a number:");
		Scanner scan = new Scanner(System.in);
		//int s=scan.nextInt();
		
		System.out.print("enter A:");
		int a=scan.nextInt();
		
		System.out.print("enter B:");
		int b=scan.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("A="+a);
		System.out.println("B="+b);

	}
}

