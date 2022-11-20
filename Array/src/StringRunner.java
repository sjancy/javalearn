
public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfTheWeek= {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "friday", "Saturday"};
		
		String mostCharDays="";
		
		for(String day:daysOfTheWeek) {
			if(day.length()>mostCharDays.length()) {
				mostCharDays=day;
			}
		}
		System.out.println("Most Character days of the week: "+mostCharDays);
		
		for(int i=daysOfTheWeek.length-1;i>=0;i--) {
			System.out.println(daysOfTheWeek[i]);
		}
	}

}
