package com.jancy.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati=new MotorBike(100);//i am using constructor here. so no need to set the speed
		MotorBike honda=new MotorBike(200);
		MotorBike toyota=new MotorBike();
		
		ducati.start();
		honda.start();
		
		//ducati.setSpeed(100); //no need because of constructor i am setting value in object
	
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);

		
		//honda.setSpeed(80);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(toyota.getSpeed());

	}

}
