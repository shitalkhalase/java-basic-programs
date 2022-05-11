package MethodOverloadding_7;

public class MainMethod_2 {
	
//can we overload main methd:yes,but with diff args, and with diff data types.

	public static void main(String[] args) {
		
		System.out.println("This is main Method");
		main(10);
	}
	
	public static void main(int s) {
		
		System.out.println("This is First overloaded main Method");
		main(10.33);
		
		
	}
public static void main(double d) {
		
		System.out.println("This is Second overloaded main Method");
		System.out.println(d);
		
		
	}

}
