import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingBatString2 {

	public static void main(String[] args) {
		
		CodingBatString2 codingbat=new CodingBatString2();
		
		String output=codingbat.doubleChar("cat");
		System.out.println(output);

		
	    int output1=codingbat.countCode("xxcozeyycop");
        System.out.println(output1);

		
        boolean output2=codingbat.bobThere("abcdefb");
	    System.out.println(output2);
	    
		String output3=codingbat.repeatEnd("jancy",2);
		System.out.println(output3);

		
        boolean output4=codingbat.sameStarChar("*xa*a*b");
	    System.out.println(output4);
	    
        boolean output5=codingbat.prefixAgain("abXYabc",3);
	    System.out.println(output5);
	    
		String output6=codingbat.starOut("a");
		System.out.println(output6);




	}
	public String doubleChar(String str) {
		String doublechar="";
		for(int i=0;i<str.length();i++) {
			doublechar=doublechar+str.charAt(i)+str.charAt(i);
			
		}
		return doublechar;		  
	}
	
	public int countCode(String str) {
		 int countcode=0;
		  for(int i=0;i<str.length();i++) {
		  if(str.length()>i+3 && str.charAt(i)=='c'  && str.charAt(i+1)=='o' && str.charAt(i+3)=='e') {
			   countcode= countcode+1;
				
				}
		 
		  }
		  return countcode;
		  
	}
	
	public boolean bobThere(String str) {
		
			   
					for(int i=0;i<str.length();i++) {
						if(str.length()>i+2 && str.charAt(i)=='b' && str.charAt(i+2)=='b') {
						return true;
						}
					}
					
					return false;
		
	}
	
	public String repeatEnd(String str, int n) {
		String repeatEnd="";
		String lasttwoletter=str.substring(str.length()-n,str.length());
		for(int i=0;i<n;i++) {
			repeatEnd=repeatEnd+lasttwoletter;
		}
		return repeatEnd;
		  
	}
	
	
	public boolean sameStarChar(String str) {
		if (str.length() <= 2) {
			return true;
		}

		boolean result = true;
		if (str.length() > 2) {
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) == '*' && str.length() >(i+1)) {
					if (str.charAt(i - 1) == str.charAt(i + 1)) {
						result = true;
					}else {
						return false;
					}
				}
			}
		}
		return result;

	}
	
	
	
	public boolean prefixAgain(String str, int n) {

		for (int i = n; i < str.length(); i++) {
			if (str.charAt(n - 1) == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	//*str*in*gy

	public String starOut(String str) {

		String starout = "";
		
		if(!str.contains("*")) {
			return str;
		}
		
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != '*') {
				if ((i - 2) >= 0) {
					if (str.charAt(i - 2) != '*' && str.charAt(i - 1) != '*') {
						starout = starout + str.charAt(i - 1);
					}
				} else {
					if( str.charAt(i - 1) != '*') {
						starout = starout + str.charAt(i - 1);
					}
				}

			}
		}
		
	
		if(str.charAt(str.length()-1)!='*' && str.charAt(str.length()-2)!='*') {
			starout = starout + str.charAt(str.length()-1);
		}

		return starout;
	}

}
