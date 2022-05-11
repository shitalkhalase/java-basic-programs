package ExceptionHandlingConcept_14;

public class ExeptionHandling_2 {
	
//3]ExceptionHandling:it is a mechanism to handle the runtime erros so that normal 
									//flow of the prog can be maintained.

	public static void main(String[] args) {
	
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		
		try {
		int a = 50/0;
		System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("/ by zero");	
		}
		
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);

	}

}
