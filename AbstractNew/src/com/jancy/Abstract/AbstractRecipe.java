package com.jancy.Abstract;

public abstract class AbstractRecipe {
	
	public void excute() {
		System.out.println("my name is abstract");
		getReady();
		doTheDish();
		cleanup();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();
}
