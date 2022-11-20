
public class SwitchCase {

	public static void main(String[] args) {
        puzzle3();


	}
	public static void puzzle1() {
		int number=1;
		switch(number) {
		case 1:{
			System.out.println(1);
			break;
		}
		case 2:{
			System.out.println(2);
			break;
		}
		case 3:{
			System.out.println(3);
			break;
		}
		default:{
			System.out.println("Defalut");
			break;
		}
		}
	}
	
	
	
	public static void puzzle2() {
		int number=2;
		switch(number) {
		case 1:{
			System.out.println(1);
			break;
		}
		case 2:  //Fall through switch
		case 3:{
			System.out.println(3);
			break;
		}
		default:{
			System.out.println("Defalut");
			break;
		}
		}
	}
	
	
	
	public static void puzzle3() {
		int number=10;
		switch(number) {
		default:{
			System.out.println("Defalut");
			break;
		}
		case 1:{
			System.out.println(1);
			break;
		}
		case 2:  //Fall through switch
		case 3:{
			System.out.println(3);
			break;
		}
		
		}
	}

}
