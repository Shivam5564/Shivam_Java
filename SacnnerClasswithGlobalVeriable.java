package MyPackage;

import java.util.Scanner;

public class SacnnerClasswithGlobalVeriable {
	
	int a;                      
	int b = 10;
	static int c;
	static int d = 50;
	
	static void add ()
	{
		Scanner s1 = new Scanner(System.in);
		c = 20;
	   int sum = c+d;
		System.out.println("Sum="+ sum );
	}
	
	 void sub()
	{
		Scanner s1 = new Scanner(System.in);
		a=10;
		//int b = 5;         local variable 
		int c =  a-b;
		System.out.println("Sub = "+c);
	}
	
	 void multi()
		{
			Scanner s1 = new Scanner(System.in);
			int a= 30;
			int c = a*b;
			System.out.println("Multi = "+ c);
		}

	 void Div()
		{
			Scanner s1 = new Scanner(System.in);
			int a = 50;
			int c = a/b;
			System.out.println("Div = "+ c);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SacnnerClasswithGlobalVeriable S1 = new SacnnerClasswithGlobalVeriable();
		S1.sub();
		S1.multi();
		S1.Div();
		

		add();
		
	}

}
