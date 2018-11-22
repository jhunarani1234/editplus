import java.util.Scanner;
class A37

{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter row number : ");
		int n=scan.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==0||j==i)
				{
					 count=1;
				}
				else
				{
					 count=count*(i-j+1)/j;
				}
				System.out.print(count +" ");
			   }
				System.out.println();
		}
	}
}
/*enter row number : 6
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 1 5 10 10 5 1
Press any key to continue . . .
*/
