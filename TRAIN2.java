
import java.util.Scanner;
class TRAIN2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++) 
			{
				System.out.print(" ");
			}
			for(int j=0;j<i-1;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}