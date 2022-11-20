
public class WhileLoop {

	private int limit;

	public WhileLoop(int limit) {
		this.limit=limit;
	}
 
	
	//For limit 30 output would be 1,4,9,16,25
	public void printSquareUptoLimit() {
		int i=1;
        while(i*i<limit){
           System.out.print(i*i + " ");
           i++;
        }
        System.out.println();
	}


	
	
	
	//For limit 30 output would be 1,8,27
	public void printCubeUptoLimit() {
		int i=1;
		while(i*i*i<limit) {
         System.out.print(i*i*i + " ");
         i++;
		}
		System.out.println();
	}

}
