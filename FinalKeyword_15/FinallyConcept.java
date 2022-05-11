package FinalKeyword_15;

public class FinallyConcept {
//Finally Block is executed in each & every case if exception occurs during the execution of program.	
	public static void main(String[] args) {
		
				//division();
				division1();
				
		}
	public static void division() 
	{
		int i=20;
		
		try
		{
			int k=i/5;
			System.out.println(k);
		}
		finally
		{
			System.out.println("Finally Code Executed");
		}
	}
	
	public static void division1() 
	{
		int i=20;
		
		try
		{
			int k=i/0;
			System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is Divide by Zero error");
		}
		finally
		{
			System.out.println("Finally Code Executed");
		}
	}

}
	


