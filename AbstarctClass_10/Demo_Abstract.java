package AbstarctClass_10;



abstract class Bike2{
	
	int i=0;
	void model () {
		System.out.println("R15"+i);
	}
	
abstract	void run();
}


public class Demo_Abstract extends Bike2{

	void run()
	{
		System.out.println("Bike is running");
	}
	
	public static void main(String[] args) {
		
		Demo_Abstract bk = new Demo_Abstract();
		bk.model();
		bk.run();
	}

}
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.

