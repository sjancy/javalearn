import java.awt.image.SampleModel;

public class CodingBat1 {

	public static void main(String[] args) {
		CodingBat1 cb=new CodingBat1();
		
		String result=cb.lastChars("", "");
		System.out.println(result);
		
		String result1=cb.extraFront("hehehe");
		System.out.println(result1);
		
		
		String result2=cb.seeColor("bluennn");
		System.out.println(result2);


		String result3=cb.startWord("h","ix");
		System.out.println(result3);


		
		String result4=cb.withoutX("x");
		System.out.println(result4);
		
		
		String result5=cb.makeAbba("jancy", "jerin");
		System.out.println(result5);
		
		String result6=cb.extraEnd("jancy");
		System.out.println(result6);

		String result7=cb.withoutEnd("jancy");
		System.out.println(result7);

		
		String result8=cb.left2("jancy");
		System.out.println(result8);
	}
	
	
	public String lastChars(String a, String b) {

	String n="@";
		if(!a.equals("")&& !b.equals("")) {
			String s1= a.charAt(0)+"";
		  	String s2=b.charAt(b.length()-1)+"";
		    String s3=s1+s2;
		    return s3;
		}else if(a.equals("")&&!b.equals("")){
			//String n="@"+"";
			String s2=b.charAt(b.length()-1)+"";
			String s4=n+s2;
			return s4;
		}else if(!a.equals("")&& b.equals("")) {
			String s1= a.charAt(0)+"";
			//String n="@"+"";
			String s5=s1+n;
			return s5;
		}else if(a.equals("")&& b.equals("")) {
			String empty=n+n;
			return empty;
			
		}
		return "";
	}
	
	public String extraFront(String str) {  
		
		
		int len=str.length();
		

	if(len>1) {
			String substr = str.substring(0, 2);
			return substr+substr+substr;
		}else {
			return str+str+str;
		}

		  
	}
	
	
	
	public String seeColor(String str) {
		
		if(str.startsWith("red")) {
			String color="red";
			return color;
		}else if(str.startsWith("blue")){
				String color1="blue";
					return color1;	
	}
		return "";
	}
	
	
	
	public String startWord(String str, String word) {
		int hhh=word.length();
		if(str.length()<1) {
			return "";
		}else if(word.substring(1).equals("x")) {
			return "";
		}
		else if(word.substring(1, word.length()).equals(str.substring(1, hhh))){
			String h=str.substring(0,hhh);
			return h;
		}
		return "";
		
		  
	}
	
	
	
	public String withoutX(String str) {
		if(str.length()==1) {
			return "";
		}
		
	else if(str.startsWith("x")&& str.endsWith("x")) {
			
			String x=str.substring(1,str.length()-1);
			return x;
			
			
		}else if(str.startsWith("x")) {
			String y=str.substring(1, str.length());
			return y;
		}else if(str.endsWith("x")) {
			String z=str.substring(0, str.length()-1);
			return z;
		}else if(!str.startsWith("x")&& !str.endsWith("x")) {
			return str;
		}
		  
		return "";
	}
	
	
	
	
	public String makeAbba(String a, String b) {
		String makeAppa=a+b+b+a;
		return makeAppa;
		  
	}
	
	
	public String extraEnd(String str) {
		
		String extraEnd=str.substring(str.length()-2, str.length());
		return extraEnd+extraEnd+extraEnd;
		  
	}
	
	
	public String withoutEnd(String str) {
		String withoutEnd=str.substring(1, str.length()-1);
		return withoutEnd;
		  
	}
	
	public String left2(String str) {
		
		String left=str.substring(0, 2);
		String left1=str.substring(2, str.length());
		String left2=left1+left;
		return left2;
		  
	}
	


}
