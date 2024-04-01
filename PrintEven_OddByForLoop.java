package MyPackage;

public class PrintEven_OddByForLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=100; i++)
		{
			if (i%2==0)
			{
				System.out.println("The number is Even = " +i);
			}
			else
			{
				System.out.println("The number is Odd  = " +i);
			}
			Thread.sleep(2000);
		}

		
		
		
		
	}

}
