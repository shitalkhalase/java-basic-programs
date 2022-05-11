package Encapsulation_11;

public class EmployeeTest_4 {
	public static void main(String[] args) {
		Employee_3 e=new Employee_3();
		 
		e.setId(111);
		e.setName("Amar");
		e.setAddress("pune");
		e.setCompany("Maxgen");
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress()+" "+e.getCompany());
	}

}
