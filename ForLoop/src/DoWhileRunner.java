import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = -1;//i am declaring number here then only i can use number in while loop
		do {
			if(number!=-1) {
			System.out.println("Cube is:" + (number * number * number));
			}
			System.out.println("Enter the number:");
			number = sc.nextInt();

		} while (number > 0);
		System.out.println("Thank You! Have Fun");

	}

}
