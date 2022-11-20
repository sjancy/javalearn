import java.util.Scanner;

public class Class {

	public static void main(String args[]) {
		Planet earth = new Planet();
		Planet mars = new Planet();

		earth.revolve();
		mars.revolve();
		
		Methods m = new Methods();
		m.printMultiplicationTable(5);
	}

}

class Planet {

	void revolve() {
		System.out.println("Revolve");
	}

}
