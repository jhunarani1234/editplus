import java.util.*;
class S13

{
	public static void main(String args[])
	{
		System.out.print("enter a string :");
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		String res="";

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90||s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='A'
			     ||s.charAt(i)=='e'||s.charAt(i)=='E'
			     ||s.charAt(i)=='i'||s.charAt(i)=='I'
			     ||s.charAt(i)=='o'||s.charAt(i)=='O'
			     ||s.charAt(i)=='u'||s.charAt(i)=='U')
				{
					 System.out.print("+"+ s.charAt(i));
					  res = res+s.charAt(i);
				}
			}
			else
			{
				res = res+s.charAt(i);

				}
		}
		System.out.println(res);  ///enter a string :124@#$%%asdfghjtyuioplkn
                                 //enter a string :1234!@#$ertyuiohff           output=+e+u+i+o1234!@#$euio
	}
}

			
			
			
			


				