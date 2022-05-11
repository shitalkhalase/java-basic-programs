package Constructor_6;

public class ConstructorArgument_2 {
	
	int x; // class attribute
	public  ConstructorArgument_2(int y)// Constructor
	{
		x=y;// some initial value
	}
	

	public static void main(String[] args) {
		

		ConstructorArgument_2 obj = new ConstructorArgument_2(20);
		System.out.println(obj.x);
		

	}

}
