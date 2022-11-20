
public class FanRunner {

	public static void main(String[] args) {
		Fan fan=new Fan("Manufacturer 1", 0.34564, "Black");
		fan.swichOn();
		fan.setSpeed((byte)5);
		System.out.println(fan);
		fan.swichOff();
		System.out.println(fan);
		//Fan fan1=new Fan("Manufacturer 2", 0.34564, "White");
		//System.out.println(fan1);

	}

}

