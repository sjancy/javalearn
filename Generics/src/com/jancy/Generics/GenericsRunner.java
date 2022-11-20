package com.jancy.Generics;

public class GenericsRunner {

	public static void main(String[] args) {
	MyCustomList<String> list=new MyCustomList<>();
	list.addElement("Element 1");
	list.addElement("Element 2");
	String value=list.get(0);
	System.out.println(value);
	
	MyCustomList<Integer> list2=new MyCustomList<>();
	list2.addElement(Integer.valueOf(4));
	list2.addElement(Integer.valueOf(6));
	Integer number=list2.get(0);
	System.out.println(number);
	
	

	}

}
