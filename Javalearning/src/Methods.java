import java.util.Scanner;
public class Methods {
	public static void main(String args[]) {

		//sayHelloWorldThrice();
		
		Methods m = new Methods();
		m.sayHelloWorldThrice();
		m.printNumbers(11);
		m.printSquaresOfNumbers(5);
		m.printMultiplicationTable(6);
		m.printMultiplicationTable1();
	}
	
	void sayHelloWorldThrice() {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
	}
	
	
	 void printNumbers(int n) {
		 System.out.println("Print numbers");
		 for(int i=1;i<=n;i++) {
			 System.out.println(i);
		 }
	 }
	 
	 /*print squareofnumbers*/
	 
	 void printSquaresOfNumbers(int n) {
		 System.out.println("Squares of numbers");
		 for(int i=1;i<=n;i++) {
			 System.out.println(i*i);
		 }
		 
	 }
	 
	 /*value passing through parameter*/
	 void printMultiplicationTable(int n) {
		 for(int i=1;i<=10;i++) {
			 System.out.println(i +"*6=" +i*n);
		 }
	 }
	 
	 /*value passing through without parameter*/
	 void printMultiplicationTable1() {
		 for(int i=1;i<=10;i++) {
			 System.out.println(i +"*6=" +i*6);
		 }
	 }
	}

