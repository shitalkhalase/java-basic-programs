package Interfaces_10;

import java.util.LinkedList;

public class LinkedListRistriction_6 {

	public static void main(String[] args) {
//same like ArrayListRistriction we can restrict any data type
		
		
		LinkedList<String> list = new LinkedList<String>();
		
		//list.add(10);/we cant use int
		//list.add(10.00);/we cant use double
		//list.add('a');//we cant use char
		list.add("Hello");
		
		System.out.println(list.size());//size 2
		
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));

		}
	}
}


