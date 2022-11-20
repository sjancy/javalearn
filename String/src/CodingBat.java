
public class CodingBat {
	
	public static void main(String []args) {
		
		CodingBat cb = new CodingBat();
		
		String output = cb.withouEnd2("Jancy");
		System.out.println(output);
		
						
		String output1 = cb.theEnd("Hello", true);
		System.out.println(output1);
		
		String output2=cb.helloName(" Janice");
		System.out.println(output2);
		
		String output3=cb.makeOutWord("<<>>", "Jonathan");
		System.out.println(output3);
		
		String output4=cb.firstHalf("JancyJerin");
		System.out.println(output4);
		
		String output5=cb.nonStart("Jancy","Jerin");
		System.out.println(output5);
		
		boolean output6=cb.endsLy("jancy");
		System.out.println(output6);
		
		String output7=cb.middleThree("and");
		System.out.println(output7);

	}
	
	public String withouEnd2(String str) {
		
		
		int length = str.length();
		
		if(length<2) {
			return "";
		}
		String withoutEnd = str.substring(1, length-1);
		return withoutEnd;
	}
	
	
	
	public String theEnd(String str, boolean front) {

          if(front==true) {
        	 return str.charAt(0)+"";
          }else {
        	  return str.substring(str.length()-1,str.length());

          }
	}
		
	public String helloName(String name) {
		
		String a="Hello";
		String b="!";
		String helloname=a.concat(name).concat(b);

	 return helloname;
		  
	}	
	
	
	public String makeOutWord(String out, String word) {
		 
		 String s=out.substring(0,2);
		 String s1=out.substring(2, 4); 
		 String result=s+word+s1;
           return result;
	}
	

	public String firstHalf(String str) {
		int length=str.length()/2;	
		String j=str.substring(0, length);	
		return j;
		  
	}

	
	public String nonStart(String a, String b) {
		int r=a.length();
		int r1=b.length();
		String join=a.substring(1, r)+b.substring(1, r1);
		return join;
		  
	}
	
	
	public boolean endsLy(String str) {
		
		if(str.endsWith("ly")) {
			return true;
		}else
		return false;
		  
	}
	
	
	public String middleThree(String str) {
		int middle = str.length()/2;
		if(str.equals(3)) {
			return str;
		}else if(!str.equals(3)) {

         String middlethree=str.substring(middle-1, middle+2);
         return middlethree;
		}
		
      return "";
	}


}
