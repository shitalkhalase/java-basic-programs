package Encapsulation_11;

public class Employee_3 {
	private int id;
	private String name;
	private String Address;
	private String Company;
	
//go to source & select generate getter&setter method.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}

}
//Encapsulation in Java is a process of wrapping code and data together into a single unit
//Getter Method:also called Accessor Method
//A method which is used to retrieve/get d values of variable or return d value of private member variable is called getter method.
//Setter Method:
//A method is used for updating or setting d values of a variable is called setter method.

//if we setup public getter & setter method to update & read d private data fields than d outside class can access those 
//private data fields via public method.


// If a data member is private it means it can only accessed within d same class.
// No outside class can access private data member (variables) of other class.

// Steps:
//1.Declare variables of a class as Private.
//2.Provide Public setter & getter method to modify & view d variables value.
