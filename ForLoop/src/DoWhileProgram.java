import java.util.Scanner;

public class DoWhileProgram {

	public static void main(String[] args) {
		
		
			Scanner sc=new Scanner(System.in);
			int choice=0;
			do {
			System.out.print("Enter the number1: ");
			int number1=sc.nextInt();
			//System.out.println("number1 is entered:" +number1);
			System.out.print("Enter the number2: ");
			int number2=sc.nextInt();
			//System.out.println("number1 is entered:" +number2);
		
			System.out.println("Choices Available are:");
			System.out.println("1-Add ");
			System.out.println("2-Subtract");
			System.out.println("3-Multiply");
			System.out.println("4-Divide");
			
			//System.out.println("5-Exit");
			
			System.out.println("Enter Choice:");
			choice=sc.nextInt();
			System.out.println("Number1: "  +number1);
			System.out.println("Number2: "  +number2);
			System.out.println("Choices: " +choice); 
			performanceUsingSwitch(number1, number2, choice);
	}while(choice<5);
			System.out.println("Bye!!");
	}
	
	
	private static void performanceUsingSwitch(int number1, int number2, int choice) {
		
		switch(choice){
			case 1:{
				System.out.println("The Ressult is:" +(number1 + number2));
				break;
		}
			case 2:{
				System.out.println("The Ressult is:" +(number1 - number2));
				break;
		}
			case 3:{
				System.out.println("The Ressult is:" +(number1 * number2));
				break;
		}
			case 4:{
				System.out.println("The Ressult is:" +(number1 / number2));
				break;
		}
			case 5:{
				System.out.println("Invalid Operator");
				break;
		}

		}
		
		
		
	
	
	
	
	
}	
}



