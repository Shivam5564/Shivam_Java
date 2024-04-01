package MyPackage;

public class MethodOverloading {

	void method(long a,  long b)
	{
		a = 200;
		b = 100;
		System.out.println(a-b);
				
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ML1 = new MethodOverloading();
		ML1.method(0,0);
		
	}

}
