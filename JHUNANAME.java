import java.util.Scanner;
class JHUNANAME
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the letter size : ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("  ");
			for(int j=0;j<n;j++)
			   {
				if(i==0||
					j==n/2&&i!=n-1
					||i==n-1&&j>0&&j<n/2
					||j==0&&i>3*n/4&&i<n-1)               //J
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			   {
				if(j==0 ||j==n-1 ||i==n/2)               //H
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			   {
				if(j==0 && i<n-1
					|| j==n-1 && i<n-1
					|| i==n-1 && (j!=0&&j!=n-1))               //U
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			   {
				if(j==0||j==n-1|i==j)               //N
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(j==0 && i>0
					||j==n/2 && i!=0
					||(i==n/2||i==0) && j<n/2 && j>0)       //A
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
						
			System.out.println();
		}
	}
}