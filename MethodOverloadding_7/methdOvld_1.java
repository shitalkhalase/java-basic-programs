package MethodOverloadding_7;

public class methdOvld_1 {

	public static void main(String[] args) {
		
		methdOvld_1 obj= new methdOvld_1();
		obj.sum();
		obj.sum(40, 30);
		obj.sum(10.33, 60.30);
	}
	
	
//1.Duplicate methods are not allowed.
//2.Method overloding:same class,same mthd name but diff no of arguments & if no of arg will be same then their data type must be different
//3.cuz of duplicacy,java compiler will confuse that which methd we have to call,thats why same methd with same args are not allowed.

		public void sum()
		{
			System.out.println("sum methd with zero parameters");
			int a=10;
			int b=20;
			int c=a=b;
			System.out.println(c);
		
		 }
		public void sum(int x, int y)
		{
			System.out.println("sum methd with two int parameters");
			int d=x+y;
			System.out.println(d);
		
		 }
		public void sum(double h, double i)
		{
			System.out.println("sum methd with two double parameters");
			double m=h+i;
			System.out.println(m);
		
		 }
		
		
		

}
