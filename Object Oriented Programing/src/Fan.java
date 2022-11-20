
public class Fan {
   //state of the object
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	
	//creation
	public Fan(String make, double radius, String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	//behavior of the object
	
	public void swichOn() {
		this.isOn=true;
	}

	public void swichOff() {
		this.isOn=false;
		setSpeed((byte)0);
	}
	
	public void setSpeed(byte speed) {
		this.speed=speed;
	}
	
	//print the state
	
	public String toString() {
		return String.format("make-%s, radius-%f ,color- %s,isOn- %b,speed- %d", make,radius,color,isOn,speed);
		
	}
	
	
	
	
	
}
