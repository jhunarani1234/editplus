import java.util.Scanner;
class S12

{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number of elements in the array you want : = ");
		int n=scan.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the elements");
		for (int i=0;i<n ;i++ )
		{
			ar[i]=scan.nextInt();
		}
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					ar[i]^=ar[j];
					ar[j]^=ar[i];
					ar[i]^=ar[j];
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			
		System.out.print(ar[i]);
		if(i!=n-1)
			{
			System.out.print(",");
			}
		}
	}
}
		
	    