import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunnable {

	public static void main(String[] args) {

      ExecutorService executorService=Executors.newSingleThreadExecutor();//it is used to single thread execute at a time.after one thread complete next thread start run.
      executorService.execute(new Task1());
      executorService.execute(new Thread(new Task2()));
      
      
		System.out.print("\nTask3 Kicked Off");
		//Task3
		for(int i=301;i<=399;i++)
			System.out.print(i+" ");
		System.out.print("\nTask3 Done");
		System.out.print("\nMain Done");
		
		executorService.shutdown();

	}

}
