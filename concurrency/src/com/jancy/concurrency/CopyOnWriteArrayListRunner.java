package com.jancy.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list=new CopyOnWriteArrayList<>();
		
		
		list.add("Cat");
		list.add("Bat");
		list.add("Ant");
		
		for(String element:list) {
			System.out.println(element);
		}
	}

}
