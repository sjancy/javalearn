import java.util.ArrayList;

public class CodingBatArray {

	public static void main(String[] args) {
		CodingBatArray cb=new CodingBatArray();
		
		
		int []x = {3,2,1};
		boolean display=cb.firstLast6(x);
		System.out.println(display);
		
		
		int []y= {1,2,3};
		int z[]= {7,3};
		boolean display1=cb.commonEnd(y,z);
		System.out.println(display1);
	}

	
	public boolean firstLast6(int[] nums) {
   if(nums[0]==6 || nums[nums.length-1]==6) {
	   return true;
   }

   else
	   return false;
	}
	
	
	public boolean commonEnd(int[] a, int[] b) {
		if(a[0]==b[0] || a[a.length-1]==b[b.length-1]) {
			return true;
		}
		
		  return false;
	}

	
	
	
	public int start1(int[] a, int[] b) {
		  int[] c={1};
		  int[] d={1};
		  if(a[0]==1){
		    return c[0];
		  }
		  if(b[0]==1){
		    return d[0];
		  }
		  
		  return c[0]+d[0];
		}
	
	
	public int[] evenOdd(int[] nums) {
		  int evenCount=0;
		  int evenArr[]= new int[nums.length];
		  int oddCount=0;
		  int oddArr[]= new int[nums.length];
		  
		  
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]%2==0){
		     evenArr[evenCount]=nums[i];
		     evenCount++;
		    }else {
		     oddArr[oddCount]=nums[i];
		     oddCount++;
		    }
		  }
		  
		  int index=0;
		  for(int j=0;j<evenCount;j++){
		    nums[index]=evenArr[j];
		    index++;
		  }
		  for(int k=0;k<oddCount;k++){
		    nums[index]=oddArr[k];
		    index++;
		  }
		  return nums;
		}

	
	public ArrayList<Integer> evenOddArrayList(int[] nums) {
		ArrayList<Integer> evenArr = new ArrayList<>();
		ArrayList<Integer> oddArr = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenArr.add(nums[i]);
			} else {
				oddArr.add(nums[i]);
			}
		}

		ArrayList<Integer> outArr = new ArrayList<>();
		outArr.addAll(evenArr);
		outArr.addAll(oddArr);

		return outArr;

	}
	
	
	

}
