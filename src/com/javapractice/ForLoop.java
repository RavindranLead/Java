package com.javapractice;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;

public class ForLoop {

	public static void main(String[] args)  {

		String name = "Elephant";
		String reveresed = "";

		for (int i = 0; i < name.length()-1; i++) {
			reveresed=name.charAt(i) + reveresed;
			
		}

		System.out.println(reveresed);

	}

}
