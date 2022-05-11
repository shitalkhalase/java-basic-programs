package Interface_Concept_9;

public class TestInterface_3 {

	public static void main(String[] args) {
		
		System.out.println(USMotor_1.min_age);
		
		System.out.println("**********************************************************");
		
		//1] static polymorphism
		
		Audi_2 obj =new Audi_2();
		obj.start();
		obj.stop();
		obj.refuel();
		obj.Milage();
		obj.brake();
		
		System.out.println("*********************************************************");
		
		//2] Dynamic polymorphism:child class can be reffered by parent interface variable
		
		USMotor_1 obj1= new Audi_2();
		obj1.start();
		obj1.stop();
		obj1.refuel();
		
		

	}

}
