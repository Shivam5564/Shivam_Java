package MyPackage;

import java.util.Date;

public class Find_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //  Find out future date after 10 days
		
		Date d1=  new Date();
		Date d2  = new Date(d1.getTime()+(1000*60*60*24*10));
		System.out.println(d2);
	}

}
