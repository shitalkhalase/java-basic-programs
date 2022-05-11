package Constructor_6;

public class constructorConcept {
	
	int x;
	public constructorConcept()
	{
		x=12;
	}

	public static void main(String[] args) {
		
//1.A constructor is a special method that is used to initialize objects state
//2.When COS called: it is called when an instance of object is created & memory is allocated for d object
//3.it can also be used to set the initial values for class attributes.
//4. why we called COS: cuz it builds d values at the time of object creation
//5.its neccessary to write COS : no, its not necessary to write a COS for a class. 
		     //if class has no COS then java compiler creates DEFAULT CONSTRUCTOR.
//6.COS name must match with the class.
//7.COS cannot have any return type.
		
		
		constructorConcept obj = new constructorConcept();
		System.out.println(obj.x);
		
		

	}

}
