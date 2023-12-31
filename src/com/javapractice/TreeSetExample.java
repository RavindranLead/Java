package com.javapractice;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("B");
		tree.add("A");
		tree.add("D");
		tree.add("E");
		tree.add("C");
		System.out.println(tree);
//		NavigableSet<String> descendingSet = tree.descendingSet();
//		System.out.println(descendingSet);
//		String first = tree.first();
////		System.out.println(first);
//		System.out.println(tree.last());
//		SortedSet<String> headSet = tree.headSet("B");
//		System.out.println(headSet);
//		SortedSet<String> tailSet = tree.tailSet("C");
//		System.out.println(tailSet);
		
		String pollFirst = tree.pollFirst();
		System.out.println(pollFirst);
		
	
		
		

	}

}
