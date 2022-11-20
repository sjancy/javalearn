package com.jancy.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cat");
		list.add("Dog");
		
		for(String string:list) {
			System.out.println(string);
		}

	}

}
