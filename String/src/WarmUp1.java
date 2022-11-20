
public class WarmUp1 {

	public static void main(String[] args) {
		WarmUp1 warm=new WarmUp1();

        int output1=warm.sumDouble(4,4);
        System.out.println(output1);
        
        boolean output2=warm.makes10(2,8);
	    System.out.println(output2);

		String output3=warm.notString("candy");
		System.out.println(output3);


		String output4=warm.front3("ca");
		System.out.println(output4);


		String output5=warm.front22("abc");
		System.out.println(output5);
		
        boolean output6=warm.in1020(12, 99);
	    System.out.println(output6);

		String output7=warm.delDel("adelHello");
		System.out.println(output7);
		
	    int output8=warm.intMax(1,2,3);
        System.out.println(output8);


	    int output9=warm.max1020(11,19);
        System.out.println(output9);

        
		String output10=warm.endUp("hi");
		System.out.println(output10);
		
	       boolean output11=warm.or35(3);
		    System.out.println(output11);


	}
	
	public int sumDouble(int a, int b) {
		int sum=a+b;
		if(a==b) {
			return sum*2;
		}else {
			return sum;
		}
	}
	
	public boolean makes10(int a, int b) {
		int sum=a+b;
		if(a==10||b==10) {
			return true;
		}else if(sum==10) {
			return true;
		}
		return false;
		  
	}
	
	public String notString(String str) {
		
		if(str.length()>=3&& str.substring(0, 3).equals("not")){
			return str;
			
		}else {
			return "not " +str;
		}
		  
	}
	
	
	public String front3(String str) {
		
		
		if(str.length()<3) {
			return str+str+str;
		}else {
			String front3=str.substring(0, 3);
		
			return front3+front3+front3;
		}
		  
	}
	
	
	public String front22(String str) {
		if (str.length()<=2) {
			return str+str+str;
		}else if(str.length()>2) {
			String firsttwoletter=str.substring(0, 2);
			
			return firsttwoletter+str+firsttwoletter;
		}
		return "";
		  
	}
	
	public boolean in1020(int a, int b) {
		if((a>=10 && a<=20)||(b>=10 && b<=20)) {
			return true;
		}return false;
		  
	}
	
	public String delDel(String str) {
		
		if(str.length()>=4 && str.substring(1, 4).equals("del")) {
			return str.substring(0,1)+str.substring(4);
			
		}else
			return str;
		  
	}


	public int intMax(int a, int b, int c) {
		if(a> b && a>c) {
			return a;
		}else if(b>c && b>a) {
			return b;
		}
			return c;
		
		  
	}
	
	public int max1020(int a, int b) {
		if((a<=10 && a>20 || b>=10 && b<=20) && (a>b)) {
			return a;
		}else if((a<=10 && a>20 || b>=0 && b<=20) && (b>a)) {
			return b;
		}
		return 0;
		  
	}
	
	public String endUp(String str) {
		//return str.toUpperCase();
		if(str.length()<=2) {
			return str.toUpperCase();
		}else if(str.length()>2){
		String end3=str.substring(str.length()-3, str.length());
		String uppercase=end3.toUpperCase();
		return str.substring(0,str.length()-3)+uppercase;
		}
		return "";
	}
	
	public boolean or35(int n) {
		if( (n%3==0) ||(n%5==0)) {
			return true;
		}
		return false;
		  
	}

}
