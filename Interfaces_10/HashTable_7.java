package Interfaces_10;

import java.util.Hashtable;

public class HashTable_7 {

	public static void main(String[] args) {
		
		Hashtable h =new Hashtable();
		
//1]Add (keys,values) pair
		h.put(200, "Hello");
		h.put(201, "world");
		h.put(202, "Selenium");
		h.put(203, "java");
		
//2]To know d size of hashtable:
		System.out.println(h.size());
		
//3]Print whole hash table
		System.out.println(h);
		
//4]Remove any element:
		
		h.remove(203);
		System.out.println(h);
		
//5]Clear hash table:
		h.clear();
		System.out.println(h);
	}
}
		
//Restriction concept are same as linkedlist and array list
//Hashtable<String,Integer> h = new<String,Integer>Hashtable();
