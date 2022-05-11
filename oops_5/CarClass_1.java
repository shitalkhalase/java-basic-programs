package oops_5;

public class CarClass_1 {  //class name
	//class variables
	String color;//variables or data member
	int model;
	int price;
	
	public void speedUp() //Method
	{
		System.out.println("This is speed Up method");
	}
	
	public void distancetraveled() //method
	{
		System.out.println("This is distancetraveled method");
	}
	public static void main(String[] args) {
		// new CarClass()------object
		//ob1,ob2---- object Reference variable
      CarClass_1 ob1 = new CarClass_1();
      CarClass_1 ob2 = new CarClass_1();
      ob1.color="black";
      ob1.model=2022;
      ob1.price=1000;
      System.out.println(ob1.color);
      System.out.println(ob1.model);
      System.out.println(ob1.price);
      ob1.speedUp();
      ob2.distancetraveled();
      
      ob2.color="white";
      ob2.price=2000;
      ob2.model=2012;
      System.out.println(ob2.color);
      System.out.println(ob2.model);
      System.out.println(ob2.price);
	}

}
