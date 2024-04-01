package MyPackage;

//public class MultiLevel_Inharitance {

	
		class First_class
		{
			static void first()
			
			{
				System.out.println("1st Parent class");
			}
		}

		class Second_class extends First_class
		{
			static void Second()
			{
				System.out.println("2st Parent class");
			}
		}

		class Trird_class extends Second_class
		{
			static void Third()
			{
				System.out.println("3st Parent class");
			}
		}

		class Fourth_class extends Trird_class
		{
			  static void Fourth()
			{
				System.out.println("4st Parent class");
			}
		}


		public class Multi_Inheritance  extends Fourth_class
		{
			
			 void Fifth()
			{
				System.out.println("Child class");
			}
			
		public static void main(String[] args) {
				// TODO Auto-generated method stub
		

			first();
			Second();
			Third();
			Fourth();
			Multi_Inheritance M1 = new Multi_Inheritance();
			
			M1.Fifth();
			
			
		}
		}

	
