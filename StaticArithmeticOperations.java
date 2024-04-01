package MyPackage;

public class StaticArithmeticOperations {
	
	
	public static void add() {
		int a = 100;
		int b = 50;
		int c = 70;
		int sum = a+b+c;
		System.out.println("Sum of the addition is="+sum);
	}

	public static void sub() {
		int a = 100;
		int b = 50;
		int sub = a-b;
		System.out.println("Sum of the sub is="+sub);
	}
	public static void multi() {
		int a = 100;
		int b = 50;
		int multi = a*b;
		System.out.println("Sum of the multi is="+multi);
	}
	
	public static void div() {
		int a = 100;
		int b = 5;
		int div = a/b;
		System.out.println("Sum of the div is="+div);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		sub();
		multi();
		div();
	}

}
