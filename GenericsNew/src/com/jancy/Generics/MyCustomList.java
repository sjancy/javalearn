package com.jancy.Generics;

import java.util.ArrayList;

public class MyCustomList<T>{
	
	ArrayList<T> list=new ArrayList<>();
	
	public void addElemnet(T element) {
		list.add(element);
	}
	
	public void removeElemnet(T element) {
		list.remove(element);
	}
	
	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		
		return list.get(index);
	}

}
