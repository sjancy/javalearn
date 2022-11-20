
public class MyNumber {




	private int number;

	public MyNumber(int number1) {
		this.number=number1;


	}

	public boolean isPrime() {
		if(number<2) {
			return false;
		}
		
        for(int i=2;i<=number-1;i++) {
        	if(number%2==0) {
        		return false;
        	}
        }

		return true;
	}

	public int Sum() {
		int total=0;
         for(int i=1;i<=number;i++) {
        	 total=total+i;
        	
         }
		
 return total;
		
	}

	public int sumOfDivisors() {
		//if number is 6 means, expext 1,6 .then we will add 2and 3.because 2 &3 divisible by six
		int total=0;
        for(int i=2;i<=number-1;i++) {
        	if(number%i==0) {
       	 total=total+i;
       	
        }
        }
		return total;
	}

	public void printATriangle() {
        for(int i=1;i<=number;i++) {
        	for(int j=1;j<i;j++) {
          System.out.print(j+ " ");      
        	}
        	 System.out.println( );

        }
	
	}

	public void printATriangle2() {
		for(int i=1;i<=number;i++) {
        	for(int k=number-1;k>=i;k--) {
          System.out.print(" ");      
        	}
        	for(int j=1;j<=i;j++) {
        	 System.out.print(j +" ");
        	}
        	System.out.println( " ");

        }
		
	
	}
	
	public void printATriangle3() {
        for(int i=1;i<=number;i++) {
        	for(int k=number-1;k>=i;k--) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<i;j++) {
          System.out.print(j);      
        	}
        	 System.out.println(  );

        }
	
	
	}

}
