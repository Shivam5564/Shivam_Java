package MyPackage;

import java.util.Scanner;

public class AreaOfCircle {
	
	Scanner sc = new Scanner(System.in);
	
 final static double Pi =3.14;
  double r= sc.nextInt();
  

 
  void areacircle() {
	 double  area = Pi*r*r; 
	 
	 System.out.println("Area of Circel  ="+area);
	 
	 
 }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle AC = new AreaOfCircle();
		
		AC.areacircle();
	}

}
