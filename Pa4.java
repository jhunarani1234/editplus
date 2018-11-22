
import java.util.Scanner;
class Pa4
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				if(i==n-1||j==n-1
					||i+j>=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("@");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("@");
			}
			
			for(int j=0;j<n;j++)
			{
				System.out.print("@");
			}
		
			System.out.println();
		}
		for(int i=0;i<n;i++)
			{
			for(int j=0;j<n;j++)
			{
				if(i>=n/2&&j>=n/2
					&&i<n-1)
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			for(int j=0;j<n;j++)
			{
				if(i>=n/2&&j<=n/2&&i<n-1)
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			for(int j=0;j<n;j++)
			{
				if(i<n/4
						||i>=3*n/4
						||j<=n/4
						||j>=3*n/4)   
				{
					System.out.print("*");
				}
				else
					{
					System.out.print(" ");
					}
			}
			for(int j=0;j<n;j++)
				{
				System.out.print("*");
				}
				for(int j=0;j<n;j++)
			{
				if(i<n/4
						||i>=3*n/4
						||j<=n/4
						||j>=3*n/4)   
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