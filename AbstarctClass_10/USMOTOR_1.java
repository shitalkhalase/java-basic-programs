package AbstarctClass_10;

public abstract class USMOTOR_1 {
	
	//int min_age=30;
	static int min_age=30;
	//final int min_age=30;
	
	public abstract void start();//abstract method
	
	public void stop()//Non-abstract method
	{
		System.out.println("USmotor----------------------------stop method");
	}
	
	public void refuel()
	{
		System.out.println("USmotor----------------------------refuel method");
	}
	
	
	
	

}
