import java.util.Scanner;
class ArrayElement1

{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("enter the element" + (i) + " ");
			ar[i]=sc.nextInt();
		}
		System.out.print("enter key element");
		int key=sc.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==key)
			{
				System.out.println("element found at"+" "+i+" "+"index"); //key element founding
				break;
			}
			else if(i==ar.length-1)
			{
				System.out.print("element not found");
			}
		}
	}
}
		
	