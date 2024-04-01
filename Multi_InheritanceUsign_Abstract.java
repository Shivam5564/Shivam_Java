package MyPackage;

abstract class Abstract1 
{
	abstract void add() ;
	
	    int a = 20;
		int b = 50;
		int Add = a+b;

	abstract void Sub();
	
		int d = 20;
		int e = 50;
		int Sub = e-d;	
		
	}


abstract class Abstract2 extends Abstract1
{
	abstract void multi();
	
		int a = 20;
		int b = 50;
		int Multi = a*b;
	
		abstract void div();
	
		int Diva = 20;
		int Divb = 5;
		int Div = Diva/Divb;
	
	void test()
	{
		System.out.println("Abstract class 2/Method 3");
	}
}

public class Multi_InheritanceUsign_Abstract   extends Abstract2
{
	
	static void concrete1()
	{
		int a = 20;
		int b = 50;
		int c = a+b;

		System.out.println("Only conrete 1 for test");
	}
	
	static void concrete2()
	{
		System.out.println("Only conrete 2 for test");
	}
	
	
public static void main(String[] args) {
	
	
		// TODO Auto-generated method stub
	Multi_InheritanceUsign_Abstract M1 = new Multi_InheritanceUsign_Abstract();
	M1. add();
	M1. Sub();
	M1.multi();
	M1.div();
	M1. test();
	concrete1();
	concrete2();
	}

@Override
void multi() {
	// TODO Auto-generated method stub
	System.out.println("Multiply      =   " + Multi);
}

@Override
void div() {
	// TODO Auto-generated method stub
	System.out.println(("Division      =   " + Div));
}

@Override
void add() {

	// TODO Auto-generated method stub
	System.out.println("Addition      =   " + Add);
}

@Override
void Sub() {
	// TODO Auto-generated method stub
	System.out.println("subtraction   =   " + Sub);
}

}
