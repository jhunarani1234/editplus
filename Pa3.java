
import java.util.Scanner;
class Pa3
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				if(i+j==n-1||j==n-1||i==n-1
					||(i==n/2&&j==n/2+2))
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
				if(i>=j||i==n-1)
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
				if(j==0||i==0||i+j<=n-1)
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
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=j||j==n-1)
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
				if(i+j==n-1)
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
				if(j==0||i==n-1||i>=j)
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