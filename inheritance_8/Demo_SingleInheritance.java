package inheritance_8;



class Employee {
	
	int empid =101;
	String empname = "Shital";
	
	
}






public class Demo_SingleInheritance extends Employee{

	String desiganation = "Softaware Tester";
	
	void showdata() {
		
		System.out.println("Employee ID: " +empid);
		System.out.println("Name :" +empname);
		System.out.println("Desgination: "+desiganation );
		
	}

	
	
	
	public static void main(String[] args) {
		Demo_SingleInheritance si =new Demo_SingleInheritance();
	
		si.showdata();

	}

}
