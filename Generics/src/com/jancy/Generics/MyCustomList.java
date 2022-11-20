package com.jancy.Generics;

import java.util.ArrayList;

public class MyCustomList<T> {
	
	ArrayList<T> list=new ArrayList<>();
	
	public void addElement(T elemant) {
		list.add(elemant);
	}
	
	public void removeElement(T elemant) {
		list.remove(elemant);
	}

	
	public String toString() {
		return list.toString();
		
	}

	public T get(int index) {
	
		return list.get(index);
	}

}
