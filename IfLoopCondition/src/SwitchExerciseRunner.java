
public class SwitchExerciseRunner {

	public static void main(String[] args) {
     System.out.println(NameOfDay(3));
     System.out.println(NameOfMonth(1));
     System.out.println(isWeekDay(1));
	}
	
	public static String NameOfDay(int number)
	{
		
		switch(number) {
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		
		}
		return "Invalid-Day";
	}
	
	public static String NameOfMonth(int monthnumber) 
	{
		switch(monthnumber)
		{
			case 0: return "January";
			case 1: return "Feburary";
		}
		
		
		return "Invalid Mounth";
		
	}
	
	public static boolean isWeekDay(int dayNumber) {
		
		switch(dayNumber) {
		case 0:                //Falls through
		case 1: return false;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:return true;
	    
		}
		return false;
	}
    
}
