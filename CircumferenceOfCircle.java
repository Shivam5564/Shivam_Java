package MyPackage;

import java.util.Scanner;

public class CircumferenceOfCircle {
	
	Scanner sc = new Scanner(System.in);
	
	 final static double Pi =3.14;
	 
	  double r= sc.nextInt();
	  

	 
	  void test() {
		 double  Circumference = 2*Pi*r; 
		 
		 System.out.println("Area of Circumference  ="+Circumference);
		 
		 
	 }
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircumferenceOfCircle COC = new CircumferenceOfCircle();
		COC.test();
		
	}

}
