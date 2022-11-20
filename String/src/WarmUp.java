
public class WarmUp {

	public static void main(String[] args) {
		WarmUp wu = new WarmUp();

		int output=wu.diff21(22);
		System.out.println(output);
		
		String output1=wu.missingChar("jeeeva",3);
		System.out.println(output1);

		String output2=wu.withoutX21("h");
		System.out.println(output2);

		String output3=wu.backAround("a");
		System.out.println(output3);
		
        boolean output4=wu.startHi("hello");
        System.out.println(output4);


        boolean output5=wu.hasTeen(12,20,45);
        System.out.println(output5);
        
        boolean output6=wu.mixStart("mixjava");
        System.out.println(output6);

        int output7=wu.close10(8,4);
        System.out.println(output7);
        
		String output8=wu.everyNth("jancy",2);
		System.out.println(output8);

        boolean output9=wu.monkeyTrouble(false,false);
        System.out.println(output9);

        boolean output10=wu.parrotTrouble(false,6);
        System.out.println(output10);
        
        boolean output11=wu.posNeg(-1,-5,true);
        System.out.println(output11);

		String output12=wu.frontBack("jancy");
		System.out.println(output12);

        boolean output13=wu.icyHot(2,120);
	    System.out.println(output13);
	 

        boolean output14=wu.loneTeen(21,13);
	    System.out.println(output14);

		String output15=wu.startOz("oxx");
		System.out.println(output15);
		
	       boolean output16=wu.in3050(50,39);
		    System.out.println(output16);
		

	}

	public int diff21(int n) {
		if (n <= 21) {
			int difference = 21 - n;
			return difference;
		} else {
			int diff = (n - 21) * 2;
			return diff;
		}
	}

	public String missingChar(String str, int n) {
		 String missingchar=str.substring(n, n+1);
		 String store=str.substring(0, n);
		 String store1=str.substring(n+1, str.length());
			String finalresult=store+store1;
			return finalresult;

	}


	public String withoutX21(String str) {
		
		if(str.length()<=2) {
			return str.replaceAll("x", "");
		}else {
			String first2Char = str.substring(0,2);
			String remainingString = str.substring(2);
			
			String first2CharWithoutX = first2Char.replaceAll("x", "");
			
			return first2CharWithoutX+remainingString;
		}
		
		
	}
	
	public String backAround(String str) {
		String endingletter=str.substring(str.length()-1);
		String backAround=endingletter+str+endingletter;
		return backAround;
		  
	}
	
	
	public boolean startHi(String str) {
		
		if(str.startsWith("hi")) {
			return true;
		}
		else
			return false;
		  
	}
	
	public boolean hasTeen(int a, int b, int c) {
		if((a>=13 && a<=19)|| (b>=13 && b<=19) ||(c>=13 && c<=19)){
			return true;
		}
		  return false;
	}
	
	public boolean mixStart(String str) {
		if(str.length()<3) {
			return false;
		}
		else {
			String firsttwo=str.substring(1, 3);
         if(firsttwo.equals("ix"))
			return true;
		}
		  return false;
	

	}
	
	public int close10(int a, int b) {
		int adifference=Math.abs(a-10);
		int bdifference=Math.abs(b-10);
		
		if(adifference<bdifference) {
			return a;
		}else if(adifference>bdifference) {
			return b;
		}else
			return 0;
			
		  
	}
	
	public String everyNth(String str, int n) {
		
		String returnVal = "";

		for(int i=0;i<str.length();i=i+n) {
			returnVal = returnVal+str.charAt(i);
		}
		return returnVal;
		  
	}
	
	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if(aSmile==bSmile) {
			return true;
		}
		else if(!aSmile &&!bSmile)
		{
			return true;
		}else
			return false;
	}
	
	public boolean parrotTrouble(boolean talking, int hour) {
		
		if( talking &&(hour<7||hour>20)){
			return true;
		}
		  
	return false;

	}
	
	public boolean posNeg(int a, int b, boolean negative) {

if((a<0&&b>0 ||a>0&&b<0) &&(negative==false)){
	return true;
}else if((a<0&&b<0) &&(negative==true))
{
	return true;
}
return false;
	}
	
	public String frontBack(String str) {
		if(str.length()<2) {
			String k=str;
			return k;
		}
		else {
		  String firststring=str.charAt(0)+"";
		  String laststring=str.substring(str.length()-1);
		  String middlestring=str.substring(1,str.length()-1);
		  String frontBack=laststring+middlestring+firststring;
		  return frontBack;
		}
	}
	
	public boolean icyHot(int temp1, int temp2) {
		  
		if(temp1<0 && temp2>100 || temp1>100 && temp2<0) {
			return true;
		}else
			return false;
	}

	public boolean loneTeen(int a, int b) {
		
		if((a>=13 && a<=19)&& (b>=20 || b<=12)){
			return true;
		}
		else if((a<12 || a>=20) && (b>=13 && b<=19)) {
		return true;
		}
	
		return false;
	}
	public String startOz(String str) {
		
		//String j=str.substring(0,2);
		//return j;
		 if(str.length()>=2 && str.startsWith("oz")) {
				String startoz=str.substring(0,2);
				return startoz;
		
		
		}else if(str.length()>=1  && str.charAt(0)=='o')
		{
			String starto=str.substring(0,1);
			return starto;
		}else if(str.length()>=2 && str.charAt(1)=='z') {
			String startz=str.substring(1,2);
			return startz;
			
		}
		return "";
		  
	}
	
	
	
	public boolean in3050(int a, int b) {
		if((a>=30 && a<=40)&&(b>=30 && b<=40)){
			return true;
		}
		else if((a>=40 && a<=50) &&(b>=40 && b<=50)) {
		return true;
		}
	
		return false;  
	}


}
