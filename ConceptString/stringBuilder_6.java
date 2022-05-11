package ConceptString;

public class stringBuilder_6 {
/*Java StringBuilder class is used to create mutable (modifiable) string.
 *  The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. 
 *  It is available since JDK 1.5.*/
	
	public static void main(String[] args) {
		
//1.The StringBuilder append() method concatenates the given argument with this string.		
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
//2The StringBuilder insert() method inserts the given string with this string at the given position.

		StringBuilder sb1=new StringBuilder("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello  
		
//3.The StringBuilder replace() method replaces the given string from the specified beginIndex and endIndex.

		StringBuilder sb3=new StringBuilder("Hello");  
		sb3.replace(1,3,"Java");  
		System.out.println(sb3);//prints HJavalo  
		
//4.The delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex.

		StringBuilder sb4=new StringBuilder("Hello");  
		sb4.delete(1,3);  
		System.out.println(sb4);//prints Hlo  

//5.The reverse() method of StringBuilder class reverses the current string.
		
		
		StringBuilder sb5=new StringBuilder("Hello");  
		sb5.reverse();  
		System.out.println(sb5);//prints olleH  
		
/*6.The capacity() method of StringBuilder class returns the current capacity of the Builder. 
	The default capacity of the Builder is 16. If the number of character increases from its current capacity,
	it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34*/

		StringBuilder sb6=new StringBuilder();  
		System.out.println(sb6.capacity());//default 16  
		sb6.append("Hello");  
		System.out.println(sb6.capacity());//now 16  
		
/*7.The ensureCapacity() method of StringBuilder class ensures that the given capacity is the minimum to the current capacity.
 *  If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2.
 *   For example if your current capacity is 16, it will be (16*2)+2=34. */
		
		StringBuilder sb7=new StringBuilder();  
		System.out.println(sb7.capacity());//default 16  
		sb7.append("Hello");  
		System.out.println(sb7.capacity());//now 16  
		sb7.append("java is my favourite language");  
		System.out.println(sb7.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb7.ensureCapacity(10);//now no change  
		System.out.println(sb7.capacity());//now 34  
		sb7.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb7.capacity());//now 70  


	}

}
