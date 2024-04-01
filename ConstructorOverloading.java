package MyPackage;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a)
	{
		
		System.out.println("Print integer");
	}
	
	ConstructorOverloading(Boolean b)
	{
		System.out.println("Print boolean");
	}
	
	ConstructorOverloading(String c)
	{
		System.out.println("Print String");
	
	}
	ConstructorOverloading(char d)
	{
		System.out.println("Prind Char");
	}
	
	ConstructorOverloading(int a, Boolean b,String c,char d)
	
	{
	
		System.out.println("Print All ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ConstructorOverloading CO1 = new ConstructorOverloading(20);
		ConstructorOverloading CO2 = new ConstructorOverloading(true);
		ConstructorOverloading CO3 = new ConstructorOverloading("Shivam");
		ConstructorOverloading CO4 = new ConstructorOverloading('c');
		ConstructorOverloading CO5 = new ConstructorOverloading(22,false,"Amit",'g');

	}

}
