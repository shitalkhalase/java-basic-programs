package Interface_Concept_9;

public class Audi_2 implements USMotor_1,IndianMotor {//IS-A is relationship between interface & class
	
	//Methods of USMotor interface

	@Override
	public void start() {
		
		System.out.println("Audi-------------------------start method");
		
		
	}

	@Override
	public void stop() {
		
		System.out.println("Audi-------------------------stop method");
		
		
	}

	@Override
	public void refuel() {
		
		System.out.println("Audi-------------------------Refual method");
		
		
	}
		
		
		//Audi class some own methods
		
		public void Milage() {
			
			System.out.println("Audi-------------------------Milage method");
			
		
	}

		@Override
		public void brake() {
			
			System.out.println("Audi-------------------------brake method");
		}

}
