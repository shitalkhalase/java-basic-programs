package corejava_1_topic;

public class Demo_variable_2 {

	static  int a=10; //Static variable,wid static 
	          //keyword in class but outside a method
	
	
static void disp() {
	
	int b=20; //local,variable declared inside 
	           //the body of the method
	System.out.println(b);

}	
	
	public static void main(String[] args) {
	int c=30;//instance variable,inside d class but outside d method	
	System.out.println(a);
	
	System.out.println(c);
	disp();
	
	
	
	}

}
