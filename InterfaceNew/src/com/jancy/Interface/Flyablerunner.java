package com.jancy.Interface;


interface Flyable{
	void fly();
}


class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("With Wings");
		
	}
}
	
	
	class Aeroplane implements Flyable{

		@Override
		public void fly() {
			System.out.println("With Fuel");
			
		}	
	
	
}

public class Flyablerunner {

	public static void main(String[] args) {
		Flyable[] flyableobjact= {new Bird(), new Aeroplane()};
		
		for(Flyable object:flyableobjact) {
			object.fly();
		}
	}

}
