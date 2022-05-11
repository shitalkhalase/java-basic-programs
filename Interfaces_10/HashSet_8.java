package Interfaces_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_8 {

	public static void main(String[] args) {
		
		HashSet<String> h =new HashSet<String>();
		
//1]Add (keys,values) pair
		h.add("Java");
		h.add("Seleniun");
		h.add("World");
		h.add("A");
				
//2]To know d size of hashSet:
		System.out.println(h.size());
				
//3]Print whole hashSet
		System.out.println(h);
		
//4]a. for each loop:
		
		System.out.println("***********Printing element by for each loop*****************");
		for(String s: h)
		{
			System.out.println(s);
		}
		
//b. iterator method
		
		System.out.println("***********printing element by iterator************************");
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//5] Print complete Hashset:
		System.out.println("**************Complete Set******************************");
		System.out.println(h);
		
//6]Remove Elements:
		System.out.println("**************After removing element******************************");
		h.remove("A");
		for(String s: h)
		{
			System.out.println(s);
		}
		
//7]Clear Hashset:
		h.clear();
		System.out.println(h);
		
//8] Converting Set into List:
		System.out.println("********************Converting Set into List************************");
		//ArrayList list =ArrayList(h);
		//System.out.println(list);
		
				
				

	}

}
