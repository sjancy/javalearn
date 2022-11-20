import java.util.Scanner;
public class Basicprogram {
	public static void main(String args[]) {

	int a=6;
	int b=7;
	int c=3;
	int d=2;
	int table=6;
	
	if((a+b) > (c+d)) {
		System.out.println("a+b is greater than c+d");
		
	}
	
	if(a % 2==0) {
		System.out.println("The number is Even");
		
	}
	
	for(int i=1;i<=10;i++) {
		System.out.println(i +"*6=" +i*6);
		
	}
	for(int i=1;i<=10;i++) {
	System.out.println(i);
	
	}
	System.out.println(  );
	for(int i=10;i>=1;i--) {
		System.out.println("The given number is:" +i);
		
		}
	
	System.out.println(  );
	for(int i=10;i>=1;i=i-2) {
		System.out.println("The Even number is:" +i);
		
		}
	
	System.out.println(  );
	for(int i=9;i>=1;i=i-2) {
		System.out.println("The Odd number is:" +i);
		
		}
	
	
	/*print square number*/
	for(int i=1;i<=10;i++) {
		System.out.println( i*i);
		
	}
	
	/*print even suare number*/
	System.out.println(  );
	System.out.println("print Even square number");
	for(int i=2;i<=10;i=i+2) {
		
		System.out.println( i*i);
		
	}
	
	
}
}