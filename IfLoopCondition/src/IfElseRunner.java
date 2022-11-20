
public class IfElseRunner {

	public static void main(String[] args) {
		int i=37;
		int number=5;
		
		if(i==34) {
			System.out.println("i=34");
		} else if(i==35) {
			System.out.println("i=35");
		}
		else if(i==36) {
			System.out.println("i=36");
		} else
		{
			System.out.println("!=34 and !=35 and !=36");
		}
		
		
		
		
		if(number>0) {
			number=number+10;
		}
		number++;
		System.out.println(number);

	}

}
