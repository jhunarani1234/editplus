import java.util.Scanner;
class S16

{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a string :");
		String s=scan.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=65 && s.charAt(i)<=90 ) )    //|| s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				t=t+(char)(s.charAt(i)+32);     //converting alphabet from upper case to lower case.
			}
				else
			{
					t=t+s.charAt(i);
			}
		}
		System.out.println("The converted lower case string is := " +t);
		char[]ar=t.toCharArray();
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					ar[i]^=ar[j];
					ar[j]^=ar[i];
					ar[i]^=ar[j];             //Shorting will done in this process
				}
			}
		}
		String res="";
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				res=res+ar[i];         // printing result remove repeated character.
			}
		}
		res=res+ar[ar.length-1];
		System.out.print("result : = " + res);
	}
}

