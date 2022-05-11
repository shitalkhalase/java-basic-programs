package inheritance_8;

public class TestInheritanceAB {// HAS-A relationship // relation between classes & IS-A is relationship between interface & class

	public static void main(String[] args) {
		
//static polymorphism or compile time polymorphism
		B obj = new B();
		obj.test(); // here overridden method will be called
		obj.test3();
		obj.test1();
		obj.test2();
		
		System.out.println("*******************************************************");
		
		
		A obj1 = new A();
		obj1.test();
		obj1.test1();
		obj1.test2();
		
		
		//super keyword:
		System.out.println("**********super keyword***********");
		obj.display();
		
		//Top casting:
		System.out.println("**************top casting*********************");
//child class object can be refferd by parent class object reffernce variable.(Run time poly& dynamic poly)
		A obj2 = new B();
		obj2.test();
		obj2.test1();
		obj2.test2();
		
		
		//Down casting:is not allowed
		// in the down casting classcastException will be thrown.
		//B obj3 = new A();parent class can not cast to child class
		
				
		
		
		
		 
}

}
