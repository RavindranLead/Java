package com.javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraysEx {

	public static void main(String[] args) {

		List<String>list = new ArrayList<String>();
		list.add("Lion");
		list.add("Tiger");
		list.add("Elephant");
		list.add("Bear");
		list.add("Dog");
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
////		boolean contains = list.contains("Cat");
////		System.out.println(contains);
////		boolean equals = list.equals("Lion");
////		System.out.println(equals);
//		System.out.println(list.get(3));
//		int indexOf = list.indexOf("Tiger");
//		System.out.println(indexOf);
//		
//		boolean empty = list.isEmpty();
//		System.out.println(empty);
//		
////		Iterator<String> iterator = list.iterator();
////		for (String listValues : list) {
////			System.out.println(listValues);
////		}
////		boolean remove = list.remove("Bear");
////		System.out.println(remove);
		System.out.println(list);
//		
//		int size = list.size();
//		System.out.println(size);
		String set = list.set(4, "Monkey");
		System.out.println(list);
		
		
		






	}

}
