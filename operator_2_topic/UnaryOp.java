package operator_2_topic;

public class UnaryOp {

	public static void main(String[] args) {
		//1] Increment operator
		//a.Pre-Increment
		
		int a=3;	
		int b=++a;//firstly value of a is incresed then assigned to b. 1+3=4.
		System.out.println(a);//4
		System.out.println(b);//4
		
		
		//b.Post-Increment
		

		int c=3;	
		int d=c++;//first c value assign to d it means d=3,then other operation performed
		System.out.println(c);//4
		System.out.println(d);//3
		
		
		//2] Decrement operator
		//a.Pre-Increment
		

		int e=3;	
		int f=--e;//first value is decresed 1-3=2.then e value assign to f.f=2
		System.out.println(e);//2
		System.out.println(f);//2
		
		//a.Pre-Increment
		

		int g=3;	
		int h=g--;//first g value assign to h it means h=3,then other operation performed
		System.out.println(g);//g--= 3-1=2
		System.out.println(h);//3
	}

}
