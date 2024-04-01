package MyPackage;

public class NonStatic {
	public static void add() //Static method 
	{
		int a = 100;
		int b = 50;
		int c = 70;
		int sum = a+b+c;
		System.out.println("Sum of the add is                ="+sum);
	}
	public static void sub() //Static method 
	{
		int a = 100;
		int b = 50;
		int sub = a-b;
		System.out.println("Sum of the sub is                ="+sub);
    }
	public static void multi()//Static method 
	{
		int a = 100;
		int b = 50;
		int multi = a*b;
		System.out.println("Sum of the multi is              ="+multi);
	}
	public static void div() //Static method 
	{
		int a = 100;
		int b = 5;
		int div = a/b;
		System.out.println("Sum of the div is                ="+div);
	}
	public static void check() //Static method 
	{
	
		System.out.println("Print Check");
	}
	
	 void addition () {
		int a1 = 10;
		int a2 = 20;
		int a3 = a1+a2;
		
		System.out.println("addition amount is              ="+a3);
	}
	 
	 void subtraction () {
			int a1 = 50;
			int a2 = 20;
			int a3 = a1-a2;
			
			System.out.println("subtraction amount is           ="+a3);
		}
   
	 void multiplication () {
			int a1 = 10;
			int a2 = 20;
			int a3 = a1*a2;
			
			System.out.println("multiplication amount is        ="+a3);
		}
	 void division () {
			int a1 = 10;
			int a2 = 20;
			int a3 = a1%a2;
			
			System.out.println("division amount is              ="+a3);
		}
	 
	 NonStatic()  //constructor
	 {  
		 System.out.println("This is my constructor");
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		add();
		sub();
		multi();
		div();
		check();
		
		NonStatic NS = new NonStatic();
		NS.addition();
		NS.subtraction();
		NS.multiplication();
		NS.division();
		
		NonStatic NS1= new NonStatic();
		
	}

}
