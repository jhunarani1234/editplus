import java.util.Scanner;
class S14

{
	public static void main(String args[])
	{
		//System.out.print("enter a string :");
		Scanner scan = new Scanner(System.in);
		do{
		System.out.print("enter a character : = ");
		
		String s=scan.nextLine();
		
		if(s.length()==1)
		{
			System.out.println("correct input");
			break;
		}
		//}
		//else
		//{
			System.out.println("wrong input");
		
		}while(true);
		
		//System.out.println();
	}
}

