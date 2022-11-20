import java.util.Scanner;
public class Parameters {
	public static void main(String args[]) {
		
		Parameters p=new Parameters();
		p.sum(3, 5);
		int val = p.somOfTwoNumbers(6, 7);
		System.out.println(val);
		
		
	}
	
	void sum(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	
	
	/* Return Type in Integer formaet*/
	
	int somOfTwoNumbers(int e,int r) {
		int add=e+r;
		return add;
	}

}
