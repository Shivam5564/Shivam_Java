package MyPackage;

import java.util.Scanner;

public class SwitchCase_WithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner S1 = new Scanner(System.in);
	
	int day = S1.nextInt();
	
	
	
	switch(day)
	
	{
	
	case 1:  
		System.out.println("Monday");
	
	break;
	
	case 2 : 
		System.out.println("Tuesday");
		break;
		
	default: 
		System.out.println("oops somthink went wrokng ");
	}
	
	
	
  
	

	}

}
