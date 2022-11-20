
public class WarmUp2 {

	public static void main(String[] args) {
		WarmUp2 warm=new WarmUp2();
		
		
		boolean output1=warm.doubleX("axaxax");
		System.out.println(output1);

		String output2=warm.frontTimes("Ab", 4);
		System.out.println(output2);

		String output3=warm.stringBits("Hello");
		System.out.println(output3);

		int output4=warm.stringMatch("aabbccdd", "abbbxxd");
		System.out.println(output4);
	
	}
	
	
	boolean doubleX(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
				return true;

			}

		}

		return false;
	}

	
	public String frontTimes(String str, int n) {
		String first3="";
		String first="";
		  if(str.length()>2){
		    for(int i=1;i<=n;i++){
		      first3=first3+str.substring(0,3);
		    }
		    return first3;
		  }
		    else if(str.length()<=2) {
		    	for(int j=1;j<=n;j++) {
		    		first=first+str.substring(0);
		    	}
		    	return first;
		    }
		  
		

		  return null;
	}
	
	
	public String stringBits(String str) {
		String bits="";
		  for(int i=0;i<=str.length();i=i+2){
		     bits=bits+str.charAt(i);
		  }
		  return bits;
		}
	
	//"aabbccdd", "abbbxxd"
	public int stringMatch(String a, String b) {
		int count = 0;
		for (int i = 0; i < a.length() - 1; i++) {
			for (int j = 0; j < b.length() - 1; j++) {
				if (a.charAt(i) == b.charAt(j)) {
					if (a.charAt(i + 1) == b.charAt(j + 1)) {
						count = count + 1;
					}
				}

			}
		}
		
		return count;
	}

}
