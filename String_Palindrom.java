package MyPackage;

public class String_Palindrom {

	public static void main(String[] args) {
		String a = "mom";
		
		
		String rev = "";
	//	System.out.println(a.substring(2,4));   // for find the Position of AM 
		//String output  = "";
		
		 for (int i =a.length()-1; i>=0; i--) {
			rev= rev + a.charAt(i);
			
			
			
		}  // System.out.println(a.charAt(2));     // for find the index 
		
		if (a.equals(rev)) 
			System.out.println("Number is Palidorm "  + a);
		
		else 
			System.out.println("Number is Not Palidorm "  );
	}

}


