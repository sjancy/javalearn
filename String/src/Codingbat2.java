
public class Codingbat2 {

	public static void main(String[] args) {
		Codingbat2 cb=new Codingbat2();

          boolean output=cb.hasBad("badxx");
          System.out.println(output);
          
          String output1=cb.conCat("bag","gas");
          System.out.println(output1);
          
          boolean output2=cb.frontAgain("");
          System.out.println(output2);
          
          String output3=cb.without2("he");
          System.out.println(output3);
          
          
          String output4=cb.makeTags("i","jancy");
          System.out.println(output4);
 

          String output5=cb.firstTwo("hello");
          System.out.println(output5);
          
          String output6=cb.comboString("b","gas");
          System.out.println(output6);
 
          String output7=cb.right2("he");
          System.out.println(output7);
          
          String output8=cb.middleTwo("heghoh");
          System.out.println(output8);
          
          String output9=cb.atFirst("h");
          System.out.println(output9);

          String output10=cb.lastTwo("jan");
          System.out.println(output10);
          
          String output11=cb.deFront("xbc");
          System.out.println(output11);



	}
	
	public boolean hasBad(String str) {
		
		if(str.startsWith("bad")) {
			return true;
			}
			else if(str.length()>1 && str.substring(1).startsWith("bad")) {
				return true;
			}
				return false;
		  
	}
	
	public String conCat(String a, String b) {
		if(!a.equals("")&&b.equals("")) {
			return a+b;
		}else if(a.equals("")&& !b.equals("")) {
			return a+b;
		}
		
	else if(a.substring(a.length()-1).equals(b.substring(0, 1))){
			String concat1=a+b.substring(1,b.length());
			return concat1;
		}
		else 
		{
		  String concat=a+b;
		  return concat;
		}
		
		
	}
		
	
	public boolean frontAgain(String str) {
		
	
	
		
     if(str.length()==0 || str.length()==1){
    	 return false;
			
		}
 else if(str.substring(0, 2).equals(str.substring(str.length()-2,str.length()))){
			return true;
		}else if(str.length()==2) {
			return true;
		}
		else
		  return false;
	}	
	
	
	public String without2(String str) {
		
		
		
		if(str.length()==1){
			return str;
		}else if(str.equals("")) {
			return "";
		}
		
		
		else if(str.length()==2) {
			return "";
			}
		else if(str.substring(0, 2).equals(str.substring(str.length()-2,str.length()))) {
			String without=str.substring(2,str.length());
			return without;
		}else 
		
		return str;
		  
	}
	
	public String makeTags(String tag, String word) {
		String makeTag="<"+tag+">";
		String makeTag1="<"+"/"+tag+">";
		
		String makeTag2=makeTag+word+makeTag1;
		
		return makeTag2;
		  
	}
	
	public String firstTwo(String str) {
		if(str.length()==1){
			return str;
		}else if(str.equals("")) {
			return "";
		}else
			return str.substring(0, 2);
	}
	
	
	public String comboString(String a, String b) {
		String cs=a.length()+"";
		String cs1=b.length()+"";
		if(a.length()>b.length()) {
			return b+a+b;
			
		}else if(a.length()<b.length()) {
			return a+b+a;
		}
		return "";
		  
	}
	
	
	public String right2(String str) {
		String right1=str.substring(str.length()-2,str.length());
		String right2=str.substring(0, str.length()-2);
		String right=right1+right2;
		return right;
	}
	
	public String middleTwo(String str) {
		
		int middle=str.length()/2;
		String middletwo=str.substring(middle-1,middle+1);
		return middletwo;
		  
	}

	
	public String atFirst(String str) {
		if(str.length()==1) {
			return str+"@";
			
		}else if(str.equals("")) {
			return "@"+"@";
		}
		else
			return str.substring(0, 2);
		  
	}
	
	
	
	public String lastTwo(String str) {
		
		if(str.length()==1) {
			return str;
		}else if(str.equals("")) {
			return "";
		}
		
		else if(str.length()>1){
		String lastTwo=str.substring(str.length()-1);//jancy means result y
		String lastTwo1=str.substring(str.length()-2,str.length()-1);//jancy means result c
		String lastTwo2=str.substring(0,str.length()-2);
         
		String FinalResult=lastTwo2+lastTwo+lastTwo1;

		  return FinalResult;
		}
		return "";
			
	}
	
	
	
	public String deFront(String str) {  
		
		String second=str.charAt(1)+"";
		//return second;
		
		 if(str.startsWith("ab")) {
			return str;
		}
		else if(str.startsWith("a")) {
            	 String sw="a"+str.substring(2, str.length());
			
			return sw;
		}else if(second.equals("b")) {
			return str.substring(1, str.length());
		}
		
             else if(str.length()>1) {
            	 String stwi=str.substring(2, str.length());
			return stwi;
		}else 
		  return "";
	}



}
