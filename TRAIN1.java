
import java.util.Scanner;
class TRAIN1
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++) //1
			{

		System.out.print(" ");
			}
			for(int j=0;j<=i;j++) //2
			{
				if(j==0||j==i||i==n-1)
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
				if(i+j<=n/2||j-i>=n/2||i-j>=n/2||i+j>=n+n/2-1) //3
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
				if(i+j>=n-1 && i>=j
					||i+j<=n-1 && i<=j)  //4
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
				if( ! (i+j>=n-1 && i>=j      //5
					||i+j<=n-1 && i<=j)||i==0||i==n-1)
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
				if(i+j<=n/2||j-i>=n/2||i-j>=n/2||i+j>=n+n/2-1)   //6
				{
					System.out.print("*");
				}
				else
					{
					System.out.print(" ");
					}
		}
		
			for(int j=0;j<=i;j++)
			{
				if(j==0||j==i||i==n-1)
				{
					System.out.print("*");    //7
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			
			for(int j=0;j<n-i-1;j++)
			{

		System.out.print(" ");
			}
			
			for(int j=0;j<n-i-1;j++) //8
			{
				if(j==0||i==0||i==n-1)
				{

		System.out.print("*");
				}
				else
				{
					System.out.print(" ");
			}
			}
			/**for(int j=0;j<=n-1;j++)
			{
				if(((j==n-1 || j==0) && i<n-1) || i==j ||i==n-1)
				{
					
		System.out.print("*");
				}
				else
				{
					System.out.print(" ");
			}
			}*/
			for(int j=0;j<=i;j++) //2
			{
				//if(j==0||j==i||j==n-1)
				//{
					System.out.print("*");
				//}
				//else
				//{
					//System.out.print(" ");
				//}
			
			}
			for(int j=0;j<=i;j++) //2
			{
				//if(j==0||j==i||j==n-1)                //9
				//{
					System.out.print("*");
				//}
				//else
				//{
					//System.out.print(" ");
				//}
			
			}
			for(int j=0;j<n-i;j++)
			{
				//if(j==n-1 && i<n-1 || i>=j && i<n-1 || i==n-1 || j==0 && i<=n-1 ||i==0 )
							if(i==0||i+j==n-1)
								{                          //12
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
