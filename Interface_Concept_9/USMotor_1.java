package Interface_Concept_9;

public interface USMotor_1 {
	
//1.Interface is abstract in nature means we can not create d object of interface.
//2.No main method in interface.
//3.we can declare variables inside interface but we can not change d value of those variables(final in nature)
//4.variables are by default public as well as static in nature.
//5.No method body only method prototype
//6.No static methods are allowed in interface

	
		
		
		int min_age=30;
		
		public void start();
		
		public void stop();
		
		public void refuel();
	}



