package ConceptString;

public class StringConcept {

	public static void main(String[] args) {
//1].string is sequence of character
//2].In java string are treated as immutable objects which means a constant & cannot be changed once created.
		
			//Creating a String:
		
//a. String Literal 
		String s="Hello World";
		System.out.println(s);
		
//b. using new keyword. string is a class not a datatype but we can use as datatype cuz its a class 
		//so we can create a object with d help of new keyword.
		String s1="Java";
		System.out.println(s1);
		
			//Methods in String
		
//1.Length():Returns number of characters
		System.out.println(s.length());
		System.out.println(s1.length());
		
//2.char charAt(int i): Returns the character at ith index
		System.out.println(s.charAt(3));
		System.out.println(s1.charAt(2));
		
//3.String substring(int i): Returns d substring from ith index character to end
		System.out.println(s.substring(3));
		System.out.println(s.substring(4, 7));
		
//4.concat(String str):concatenates specified string at d end of string
		System.out.println(s.concat(s1));
		
//5.toUpparCase():it will convert all letters uppar case
		System.out.println(s1.toUpperCase());
		
//6.toLowerCase():it will convert all letters lower case
		System.out.println(s1.toLowerCase());
		
//7.trim():eliminates white spaces before as well as end from string
		String s2="   Sele_nium   ";
		System.out.println(s2);
		System.out.println(s2.trim());
		
//8.startsWith(): and endsWith():it will return boolean value
		System.out.println(s1.startsWith("j"));
		System.out.println(s1.endsWith("a"));
		
//9.replace():replace all occurrences of first sequence of character with second sequence of character
		String s3="Hello Java. Hello Selenium.";
		System.out.println(s3.replace("Hello", "zero"));
		System.out.println(s3.replace('H', 'Z'));
		
//10.equals():compare d string to d specified object or string
		System.out.println(s1.equals("java"));
		System.out.println(s1.equalsIgnoreCase("java"));
		
//11. Java String valueOf() method
//The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.
			int a=30;  
			String S =String.valueOf(a);  
			System.out.println(s+50);  
			
				String D =new String("Sachin");  
				String J = D.intern();  
				System.out.println(s2);//Sachin  

			
			

	}

}
