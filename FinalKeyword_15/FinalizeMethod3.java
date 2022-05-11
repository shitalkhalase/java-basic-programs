package FinalKeyword_15;

public class FinalizeMethod3 {
	
	public void finalize() 
	{
		System.out.println("Finalize Method Excuted");
	}

	public static void main(String[] args) {
//This perticular method is related to garbage collection method.
//JVM automatically swipes out all d unwanted & amended objects automatically.
//Finalize method is used to clean up operation before calling the garbage collector method.(system.gc();)
		FinalizeMethod3 a1=new FinalizeMethod3();
		FinalizeMethod3 a2=new FinalizeMethod3();
		
		a1=null;
		a2=null;
		System.gc();
	}

}
