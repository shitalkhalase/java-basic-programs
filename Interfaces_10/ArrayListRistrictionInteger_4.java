package Interfaces_10;

import java.util.ArrayList;

public class ArrayListRistrictionInteger_4 {

	public static void main(String[] args) {
	
//Ristriction Integer used for only integer values we can access or take another data types are not going to be excute.
//we can Ristrict any type of data type		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(10);
		//list.add('a');//we cant use char
		//list.add("Hello");// we cant use string
		
		System.out.println(list.size());//size 2
		
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
//We can add multiple integer 		
		list.add(30);
		list.add(50);
		System.out.println(list.size());//4
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}

	}

}
