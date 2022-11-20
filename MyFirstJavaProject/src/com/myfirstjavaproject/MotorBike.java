package com.myfirstjavaproject;

public class MotorBike {
	
	//State
	
	private int speed;//member variable ,it belongs to the objects
	
	MotorBike(){//this is default constructor.....we no need to assign the value in object.
		this(5);
	}
	
	
	MotorBike(int speed){//constructor
		this.speed=speed;
		
	}
	

	//method
	//name-int speed
	//output-void
	//method name-setSpeed
	
	/*void setSpeed(int speed) {//local variable
		this.speed=speed;
		
		//System.out.println(speed);// this is access local variable
		//System.out.println(this.speed);//this is access member variable
			
	}
	
	int getSpeed() {
		return this.speed;
	}*/
	

	public int getSpeed() {
		return speed;
	}

    public void setSpeed(int speed) {
    	if(speed>0)
		//System.out.println(speed);
		//System.out.println(this.speed);
		this.speed = speed;
	}
    
    
    public void increaseSpeed(int howMuch) {
    	setSpeed(this.speed+howMuch);
    }

    public void decreaseSpeed(int howMuch) {
    	setSpeed(this.speed-howMuch);
    }




	void start() {
		System.out.println("Bike started");
	}





}
