import java.util.Scanner;
class S2

{
	public static void main(String args[])
	{
		System.out.print("enter a string :");
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		String rev="";
		char ar[]=s.toCharArray();
		for(int i=0;i<ar.length/2;i++)
		{
			char t=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=t;
		}
		for(int i=0;i<ar.length;i++)
		{
			rev=rev+ar[i];
		}
		System.out.println(rev);
	}
}

