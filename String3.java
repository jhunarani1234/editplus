import java.util.*;
class String3

{
	public static void main(String args[])
	{
		System.out.print("enter a string :");
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		String res="";
		System.out.print("enter the key");
         int k=scan.nextInt();
		 k=k%26;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90||s.charAt(i)>=97 && s.charAt(i)<=122)       
			{
				if(s.charAt(i)>=65 && s.charAt(i)<=90-k ||s.charAt(i)>=97 && s.charAt(i)<=122-k)
				{
				res=res+(char)(s.charAt(i)+k);
			    }
			    else
			     {
				res=res+(char)(s.charAt(i)+k-26);
			     }
		       }
		    else
			{
			res=res+s.charAt(i);
			}
		}
		System.out.print(res);
	}
}

