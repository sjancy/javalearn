
public class MyNumberRunner {

	public static void main(String[] args) {

        MyNumber number=new MyNumber(6);
        /*boolean isPrime=number.isPrime();
        System.out.println("isPrime"   +isPrime);*/
                  /*or*/
        
        System.out.println(number.isPrime());
         System.out.println(number.Sum());
         
         int sumOfDivisors=number.sumOfDivisors();
         System.out.println("sumOfDivisors" +sumOfDivisors);
         number.printATriangle();
         number.printATriangle2();
         number.printATriangle3();
	}

}
