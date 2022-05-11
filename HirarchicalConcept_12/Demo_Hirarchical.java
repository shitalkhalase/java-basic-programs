package HirarchicalConcept_12;

//When two or more classes inherits a single class, it is known as hierarchical inheritance
class Animal{
	void eat () {
		System.out.println("Eating'");
	}
}

class Dog extends Animal{
	
	void bark () {
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal {
	
	void run ()
{
System.out.println("cat is running");	
}
	
	
	}

public class Demo_Hirarchical {

public static void main(String[] args) {
		
Cat c = new Cat();

c.eat();
c.run();

Dog d = new Dog();
d.bark();
d.eat();

	}

}
