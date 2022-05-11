package MethodOverloadding_7;

public class WrapperClass {

	public static void main(String[] args) {
		
//wrapper classes used to convert primitive data type to object and vice versa.
//Auto-Boxing=conversion from primitive data type to object.
//Auto-unboxing=conversion from object to primitive data type.
//all 8 type of wrapper classes are available in lang.package
//int=Integer - Integer is a class wrapper class
//char=Character
//boolean=Boolean
//whatever d primitive data type is just make d first letter is capital it will automatically convert into wrapper classes.

		//1]conversion from primitive data type to object
		int a =100;
		Integer i= Integer.valueOf(a);//conversion from int to Integer. it will store in i
		Integer j=a;//Auto-boxing compiler automatically write Integer.valueOf(a) value internally.
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("*************************************************************");
		
		
		//2]conversion from object to primitive data
		Integer x = new Integer (50);
		int y=x.intValue();//conversion from Integer to int.
		int z=y;////Auto-unboxing compiler automatically write .intValue() value internally.
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		

		System.out.println("*************************************************************");
		
		//3]Data conversion
//int to string
		int m=80;
		String s=String.valueOf(m);//string value stored in s.
		System.out.println(m+20);
		System.out.println(s+20);//concat operation, cuz int convert into s string
		
		System.out.println("***************************************************************");
		
		//4]string to int
		String l="100";
		int n = Integer.parseInt(l);//Integer value stored in n.
		System.out.println(n+50);
		
		System.out.println("***********************************************************");
		
		
		//5]string to double
		String t="10.22";
		double p= Double.parseDouble(t);//Double value stored in p.
		System.out.println(p+20.2);
		
	
	}

}
