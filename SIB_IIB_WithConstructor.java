package MyPackage;

public class SIB_IIB_WithConstructor {
	 static int a ;
	static {
		
		System.out.println("This is my SIB");
	}
	
	{
		System.out.println("This is my IIB");
	}
	
	SIB_IIB_WithConstructor(){
		
		System.out.println("This is my Constructor");
}
	

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		//SIB_IIB_WithConstructor IB = new SIB_IIB_WithConstructor();
		SIB_IIB_WithConstructor IB1 = new SIB_IIB_WithConstructor();
//		
System.out.println("This is my main method");
	}

}
