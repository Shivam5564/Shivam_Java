package MyPackage;

import java.util.Scanner;

public class AreaOfCircleByForLoop {
	

	  public static void main(String[] args) {
		  
		  Scanner s1=new Scanner(System.in);
		  for (int i=1; i<=10; i++) {
		  System.out.println("Enter the radius: ");
		  double pi=3.14;
		  int r=s1.nextInt();
		  double area =(pi*r*r);
		  System.err.println("Area of circle :"+ area);
			
		  }
	
	 }
}
