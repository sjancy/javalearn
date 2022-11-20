package com.jancy.Abstract;

public class ReceipeWithMicrowave extends AbstractRecipe{

	@Override
	void getReady() {
		System.out.println("get the raw materials");
		System.out.println("switch on the microwave");
		
	}

	@Override
	void doTheDish() {
		System.out.println("get the stuff ready");
		System.out.println("put it in the microwave");
		
	}

	@Override
	void cleanup() {
		System.out.println("cleanup the utensils");
		System.out.println("switch off the microwave");
		
	}

}
