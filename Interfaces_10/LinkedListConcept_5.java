package Interfaces_10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept_5 {

	public static void main(String[] args) {
// all program is same like ArrayList only change is that we used LinkedList.		
		
		LinkedList list = new LinkedList();
		
//1]Adding Element in ArrayList
		list.add(10);
		list.add(20);
		list.add("Hello");
		list.add('A');
				
//2] To know the size of ArrayList
		System.out.println(list.size());
				
//3]Accessing elements in ArrayList
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
				
				
//4] Traversing all elements in ArrayList
				//a. for loop
				
		System.out.println("************Traversing all elements for loop*****************");
				
		for(int i=0; i<list.size(); i++)
			{
				System.out.println(list.get(i));
			}
				
				
				//b. iterator method 
				
		System.out.println("************Traversing all elements by iterator method *****************");
				
				
		Iterator itr=list.iterator();
			while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				
//5] Remove elements:
				
		System.out.println("************Traversing elements after removing elements *****************");
				
		list.remove(2);
				
		for(int i=0; i<list.size();i++)
			{
					System.out.println(list.get(i));
			}
				
//6] Clear complete ArrayList:
				
		System.out.println("*****************clearing Element in ArrayList*********************");
				
		list.clear();
				
				

			}

	}

