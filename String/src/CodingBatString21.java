
public class CodingBatString21 {

	public static void main(String[] args) {
		CodingBatString21 string21=new CodingBatString21();
		
	    int output1=string21.countHi("ABChi hi");
        System.out.println(output1);
        
        boolean output2=string21.endOther("AbC","HiaBc");
 	    System.out.println(output2);


        boolean output3=string21.xyBalance("yaaxbb");
 	    System.out.println(output3);
 	    
		String output4=string21.repeatFront("Chocolate",4);
		System.out.println(output4);


        boolean output5=string21.xyzMiddle("AxyzBB");
 	    System.out.println(output5);

	}
	
	public int countHi(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.length()>1 && str.charAt(i)=='h' && str.charAt(i+1)=='i') {
				count=count+1;
			}
		}
		return count;
		  
	}
	
	// a = AbC
	// b = HiaBc
	public boolean endOther(String a, String b) {
		
		
		String a1=a.toLowerCase();
		int alen=a1.length();
		String b1=b.toLowerCase();
		int blen=b1.length();
		
		//System.out.println("alen: "+alen);
		//System.out.println("blen: "+blen);

		if(alen<blen) {
			//System.out.println("Inside if");
			String m=b1.substring(blen-a1.length());
			//System.out.println("a1: "+a1);
			//System.out.println("m: "+m);
			
			if(a1.equals(m)) {
				return true;
				
			}
			
		}else if(blen<alen) {
			String value=a1.substring(alen-b1.length());
			if(b1.equals(value)) {
				return true;
			}
		}
		else if(a1.equals(b1)) {
			return true;
		}
		
		
  return false;
	}
	
	//aaxbby
	public boolean xyBalance(String str) {
		boolean result=true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='x') {
				result=false;
			}
				if(str.charAt(i)=='y') {
					result=true;
				
			}
		}
		return result;
			
		}
	
	//Chocolate
	public String repeatFront(String str, int n) {
		String repeatFront="";
		int m = n;
		for(int i=0;i<n;i++) {
			repeatFront=repeatFront+str.substring(0, m);
			
			m--;
		}
		return repeatFront;
		  
	}
	
	//AABBCCCDDEE
	
	//AxyzBB
	public boolean xyzMiddle(String str) {
		
		int length = str.length();
		int middle = length/2;
		System.out.println("middle: "+middle);
		
		//10 - 5
		//11 - 6
		
		//if(length%2!=0) { //odd
			String str1 = str.substring(middle-1, middle+2);
			System.out.println("str1: "+str1);
			if(str1.equals("xyz")) {
				return true;
			}
			
			if(length%2==0) {
				String str2 = str.substring(middle-2, middle+1);
				System.out.println("str2: "+str2);
				if(str2.equals("xyz")) {
					return true;
				}
			}
		//}
		

		return false;
	}

	
	public boolean xyzMiddle1(String str) {
		
		for(int i=0;i<str.length()-2;i++) {
			String str1 = str.substring(i, i+3);
			//System.out.println("str1: "+str1);
			
			int left = i;
			int right = str.length()-(i+3);

			//System.out.println("left: "+left+"; right: "+right);
			
			if(str1.equals("xyz")) {
				//if(left==right || left-right ==1 || right-left==1) {
				//	return true;
				//}
				
				int diff = Math.abs(left-right);
				if(diff <=1) {
					return true;
				}
			}

		}

		return false;
	}
		  
	

}
