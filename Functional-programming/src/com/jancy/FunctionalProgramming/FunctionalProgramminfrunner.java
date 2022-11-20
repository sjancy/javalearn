package com.jancy.FunctionalProgramming;

import java.util.List;

public class FunctionalProgramminfrunner {

	public static void main(String[] args) {

      List<String> list=List.of("Apple", "Bat", "Cat", "Dog");
      
      printWithFBWithFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for(String string:list) {
			  System.out.println(string);
		  }
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
			  System.out.println(string);
		  }
		}
	}
	
	
	private static void printWithFB(List<String> list) {
	list.stream().forEach(element-> System.out.println("element - "+element));
	}


	private static void printWithFBWithFiltering(List<String> list) {
	list.stream()
	.filter(element->element.endsWith("at") )
	.forEach(element-> System.out.println("element - "+element));
	}

}
