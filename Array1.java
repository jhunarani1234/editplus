import java.util.Scanner;
class Array1
{
	public static void main(String srgs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the elements :");
		int fl=0,sl=0;

		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		if(ar[0]>=ar[1])
		{
			fl=ar[0];
			sl=ar[1];
		}
		else
		{
			fl=ar[1];
			sl=ar[0];
		}
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>fl)
			{
				sl=fl;
				fl=ar[i];
			}
			else if(ar[i]>sl)
			{
				sl=ar[i];
			}
		}
		System.out.print(fl);
        System.out.print(sl);

	}
		
}