package Constructor_6;

public class StaticNONSTATic {
	
	String name ="maxgen";// Non static variable
	static int age = 20;// static variable

	public static void main(String[] args) {
//1] How to access static variables as well as method.
		//a] With the help of class name
		
		StaticNONSTATic.XYZ(); // accessing static method with help of class name
		System.out.println(StaticNONSTATic.age);// accessing static variable with help of class name
		
		//b] Direct call	
		
		XYZ();// accessing static method with help of direct call
		System.out.println(age);//accessing static variable with help of direct call
		
//2]  How to access Non static variables as well as method.	
		StaticNONSTATic obj= new StaticNONSTATic();
		obj.ABC();//accessing non static method with help of object
		System.out.println(obj.name);//accessing non static variable with d help of object
			
}
		
		public void ABC(){ //non static method
	
	System.out.println("This is ABC method");
}

	public static void XYZ()// static method
{
	System.out.println("This is XYZ method");
}
}

