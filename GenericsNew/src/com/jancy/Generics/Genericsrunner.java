package com.jancy.Generics;

public class Genericsrunner {

	public static void main(String[] args) {
		MyCustomList<String> list=new MyCustomList<>();
		
		list.addElemnet("Element 1");
		list.addElemnet("Element 2");
		String value=list.get(0);
        System.out.println(value);
        
		
		MyCustomList<Integer> list2=new MyCustomList<>();
		list2.addElemnet(Integer.valueOf(5));
		list2.addElemnet(Integer.valueOf(7));
		Integer number=list2.get(0);
		System.out.println(number);

	}

}
