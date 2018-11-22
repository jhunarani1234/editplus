import java.util.Scanner;
class MultiThread extends Thread
{
	public void run()
	{
		if(getName().equals("Banking"))
		{
			banking();
		}
		else if(getName().equals("Printing"))
		{
			printing();
		}
		else
		{
			add();
		}
	}
	void banking()
		{
		Scanner scan = new Scanner(System.in);
		System.out.print("banking started: ");
		System.out.print("Enter the bank account number");
		int n=scan.nextInt();
		System.out.println("Enter the pin");
		int pin=scan.nextInt();
		System.out.println("collect ypur money");
		System.out.println("Banking completed");
		}
		void printing()
		{
			System.out.println("Printing started");
			try
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("ABC");
					Thread.sleep(5000);
				}
			}
			catch (Exception caught)
			{
				System.out.println("Exceotion caught");
			}
			System.out.println("Printing completed");
		}
		void add()
		{
			System.out.println("Addition started");
			int a=910;
			int b=827;
			int c=a+b;
			System.out.println(c);
			System.out.println("Addition completed");
		}
}
		class Launch
			{
			public static void main(String args[])
				{
				MultiThread d1=new MultiThread();
				MultiThread d2=new MultiThread();
				MultiThread d3=new MultiThread();
				d1.setName("Banking");
				d2.setName("Printing");
				d3.setName("Adding");
				d1.start();
				d2.start();
				d3.start();
				}
			}