package MyPackage;

import java.util.Scanner;

public class SacnnerClasswithLocalVeriable {
	
	void add ()
	{
		Scanner s1 = new Scanner(System.in);
		int a =100; 
		int b = 200;
		int sum = a+b;
		System.out.println("Sum="+ sum );
	}

	static void sub()
	{
		Scanner s1 = new Scanner(System.in);
		long a=10;
		long b = 5;
		long c =  a-b;
		System.out.println("Sub = "+c);
	}
	
	void multi()
	{
		Scanner s1 = new Scanner(System.in);
		int a = 50;
		int b =20;
		int c = a*b;
		System.out.println("Multi = "+ c);
	}
	
	void Div()
	{
		Scanner s1 = new Scanner(System.in);
		int a = 10;
		int b =2;
		int c = a/b;
		System.out.println("Div = "+ c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 sub();
		 
		 SacnnerClasswithLocalVeriable S1 = new SacnnerClasswithLocalVeriable();
		 S1. add();
		 S1. multi();
		 S1.Div();
		 
	}

}
