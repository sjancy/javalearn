package com.jancy.oops;

public class MotorBike {
	
	//State
			private int speed;//memeber variale
			//Constructor
			MotorBike(){//this is no argumental parameter constructor. why i created this ,i didn't set any value in "toyota". so we need default constructor.Already we have constructor.
				this(5);
			}
			
			
			MotorBike(int speed){//we created this method because of constructor
				this.speed=speed;
			}
			 
			
			
	public int getSpeed() {
				return speed;
			}


			public void setSpeed(int speed) {
				if(speed>0)
				this.speed = speed;
			}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed+howMuch);//we are using setSpeed method here. beacause we put condition there. so we no need to put condition again and again.this is how we using encapsulatuion.
	}
	
	
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	
			
			
	/*//behaviour	
	//methid
	//inputs-int speed
	//outputs-void
	//name-setSpeed		
			
	void setSpeed(int speed) {//local variable
		
		this.speed=speed;
		//member variable(this.speed)=local variable(speed)
	}*/




	void start() {
		System.out.println("Bike Started");
	}

}
