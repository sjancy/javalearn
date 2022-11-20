package com.myfirstjavaproject;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati=new MotorBike(100);
		MotorBike honda=new MotorBike(200);
		MotorBike maruthi=new MotorBike();
		MotorBike hundai=new MotorBike();//default constructor value will take automatically
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(maruthi.getSpeed());
		System.out.println(hundai.getSpeed());
		
		ducati.start();
		honda.start();
		
		//ducati.setSpeed(100);//we are setting value here.Instance variable is only referred by instance object
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(100);
		honda.decreaseSpeed(50);
		
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
		//honda.setSpeed(80);
		//System.out.println(honda.getSpeed());
	
	}

}
