
public class Codingbat3 {

	public static void main(String[] args) {
		Codingbat3 cb=new Codingbat3();
		
		String output=cb.nTwice("hello",2);
        System.out.println(output);
        
		String output1=cb.twoChar("java",3);
        System.out.println(output1);
        
		String output2=cb.minCat("java","hello");
        System.out.println(output2);

		String output3=cb.withoutX2("hxello");
        System.out.println(output3);


	}
	
	
	public String nTwice(String str, int n) {
		if(n>=1) {
			String twice=str.substring(0, n);
			String twice1=str.substring(str.length()-n, str.length());
			String nTwice=twice+twice1;
			return nTwice;
		}
		
	return "";	  
	}
	
	
	public String twoChar(String str, int index) {
		
		int minValidIndex = 0;
		  int maxValidIndex = str.length()-2;
		  
		  if(index < minValidIndex|| index > maxValidIndex){
		    return str.substring(0,2);
		  }
		  
		  String twochar=str.substring(index,index+2);
			return twochar;
	}
	
	
	
	public String minCat(String a, String b) {
		int mincat=a.length();
		int mincat1=b.length();
		if(mincat>mincat1) {
			String mc=a.substring(a.length()-b.length(), a.length())+b;
			return mc;
		}else if(mincat<mincat1) {
			String mt=a+b.substring(b.length()-a.length(), b.length());
			return mt;
			
		}
		
		return "";
		  
	}
	
	
	public String withoutX2(String str) {
		
		
		//String firstletter=str.substring(0,1);
		//String secondletter=str.substring(1,2);
		//String length=str.length()+"";
		if(str.equals("")) {
			return "";
		}else if(str.equals("x")) {
			return "";
		}
		
		
		else if(str.substring(0,1).equals("x")&& str.substring(1,2).equals("x")) {
			String value=str.substring(2, str.length());
			return value;
		}else if(str.substring(0,1).equals("x")&& !str.substring(1,2).equals("x")) {
			String value1=str.substring(1, str.length());
			return value1;
			
		}else if(!str.substring(0,1).equals("x")&& str.substring(1,2).equals("x")) {
			String value2=str.replace("x", "");
			return value2;
			
		}else
		
		return str;
		
	}

}
