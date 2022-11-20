
public class Logic {

	public static void main(String[] args) {
		Logic lc=new Logic();
		
       boolean output=lc.cigarParty(30, true);
	   System.out.println(output);

       boolean output1=lc.love6(4, 5);
	   System.out.println(output1);

       boolean output2=lc.more20(20);
	   System.out.println(output2);
	   
	   boolean output3=lc.nearTen(17);
       System.out.println(output3);

	   int output4=lc.teaParty(3,6);
       System.out.println(output4);

	   boolean output5=lc.twoAsOne(3,2,2);
       System.out.println(output5);

	   boolean output6=lc.lastDigit(23, 19, 12);
       System.out.println(output6);

	   int output7=lc.maxMod5(9,14);
       System.out.println(output7);
	

	   int output8=lc.dateFashion(10,5);
       System.out.println(output8);


       boolean output9=lc.in1To10(9,true);
       System.out.println(output9);

		String output10=lc.fizzString("abc");
		System.out.println(output10);

	    boolean output11=lc.inOrder(1, 2, 1, false);
	    System.out.println(output11);

	    boolean output12=lc.lessBy10(11, 1, 7);
	    System.out.println(output12);

		int output13=lc.redTicket(1,1,2);
	    System.out.println(output13);
	       
		boolean output14=lc.shareDigit(12,23);
	    System.out.println(output14);

	    
		int output15=lc.noTeenSum(17, 18, 19);
	    System.out.println(output15);
	    
		int output16=lc.blackjack(19, 22);
	    System.out.println(output16);


	    boolean output17=lc.closeFar(4, 1, 3);
	    System.out.println(output17);
	    
	    
		int output18=lc.makeChocolate(5, 4, 9);
	    System.out.println(output18);
	    
	    
	    

	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		 if(isWeekend==true && cigars >=40) {
				return true;
			}
if(isWeekend==false && cigars >=40 && cigars<=60){
			return true;
		}
	else
	 return false;
	}
	
	
	
	public boolean love6(int a, int b) {
		
		if(a==6 || b==6) {
			return true;
		}
		else if(Math.abs(a+b)==6) {
			return true;
			
		}
		else if(Math.abs(a-b)==6) {
			return true;
			
		}else if(Math.abs(b-a)==6) {
			return true;
			
		}
		else
			return false;
		  
	}
	
	
	
	public boolean more20(int n) {
		if(n%20==1 || n%20==2) {
			return true;
		}
		else
			return false;
		  
	}
	
	public boolean nearTen(int num) {

		if (num % 10 < 3 || num % 10 >= 8) {

			return true;
		}

		else
			return false;

	}
	
	public int teaParty(int tea, int candy) {
		if(tea >=5 &&candy>=5)
			  if(( tea>=2*candy) || ( candy>=2*tea)){
						  return 2;
					  }
					  if(tea>=5 && candy>=5){
						  return 1;
					    
					  }
					  else 
					  return 0;
		}
	
	public boolean twoAsOne(int a, int b, int c) {
		int add=a+b;
		int diff=Math.abs(a-b);
		int diff1=Math.abs(b-a);
		int cvalue=Math.abs(c);
		
		if(add==cvalue) {
			return true;
		}
		else if(diff==cvalue || diff1==cvalue) {
			return true;
		}
		else
			return false;
		
		  
	}
	
	public boolean lastDigit(int a, int b, int c) {
		
		return (a%10 == b%10 || b%10==c%10 || c%10==a%10);
		  
	}


	public int maxMod5(int a, int b) {
		 if(a==b) {
				return 0;
			}
			  if(a%5==b%5) {
				  return Math.min(a,b);
			  }
			  else
				  return Math.max(a,b);
		  
	}
	
	public int dateFashion(int you, int date) {
		if(you<=2|| date<=2){
			return 0;
		}
		else if(you>=8 || date>=8) {
			return 2;
		}
		return 1;
		  
	}


	
	public boolean in1To10(int n, boolean outsideMode) {
		if(outsideMode==true && (n<=1 ||n==11)){
		    return true;
		  }
		if(n>=1 && n<=10){
		    return true;
		  }
		  return false;
		}
	
	
	public String fizzString(String str) {
		String result="";
		  if(str.startsWith("f") && str.endsWith("b")) {
			result=result+"FizzBuzz";
		  }
		  else if(str.startsWith("f")) {
			  result=result+"Fizz";
		  }
		  else if(str.endsWith("b")) {
			   result=result+"Buzz";
		  }
		  else
			  result =result+str;
		  return result;
		  
		}

	
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		
		  if(bOk==false && b>a && c>b){
		    return true;
		  }
		  else 
			  if(bOk==true && c>b){
		    return true;
		  }
		  return false;
		}
	
	
	public boolean lessBy10(int a, int b, int c) {
		int ab=a+b;
		
		if(ab-a>=10||ab-b>=10||ab-c>=10){
			   return true;
			 }
			 return false;
		}
	
	
	
	public int redTicket(int a, int b, int c) {
		  if(a==2 && b==2 && c==2){
		    return 10;
		  } if(a==b && b==c && c==a){
		    return 5;
		  }if(a!=b && a!=c) {
			  return 1;
		  }
		  else
		  return 0;
		  
		}
	
	public boolean shareDigit(int a, int b) {
		 int aL= a/10;
		 int aR=a%10;
		 int bL=b/10;
		 int bR=b%10;
		 if(aL==bL || aL==bR || aR==bL || aR==bR) {
		  return true;
		 }else
			 return false;
		}

	
	
	public int noTeenSum(int a, int b, int c) {

		int result = 0;
		if (a <= 12 && b <= 12 && c <= 12) {
			result = a + b + c;
			return result;
		}
		a = fixTeen(a);
		b = fixTeen(b);
		c = fixTeen(c);
		
		result = a + b + c;
		return result;

	}
	
	
	private int fixTeen(int num) {
		if (num == 13 || num == 14 || num >= 17 && num <= 19) {
			num = 0;
			return num;
		}else {
			return num;
		}
	}
	
	
	
	
	public int blackjack(int a, int b) {
		if (a == 21) {
			return a;
		}
		if (b == 21) {
			return b;
		}
		if(a>=21 && b>=21) {
			return 0;
		}
		for (int i = 3; i <= 3; i--) {
			if (a + i == 21) {
				return a;
			} else if (b + i == 21) {
				return b;
			}
		}

		return 0;

	}
	
	
	public boolean closeFar(int a, int b, int c) {
		  int AB=Math.abs(a-b);
		  int BC=Math.abs(b-c);
		  int CA=Math.abs(c-a);
		  if(AB==1 && BC>1 && CA>1) {
			  return true;
		  }else if(AB>1 && BC==1 && CA>1) {
			  return true;
		  }else if(AB>1 && BC>1 && CA==1) {
			  return true;
		  }
		  return false;
		}

	
	public int makeChocolate(int small, int big, int goal) {
		for(int i=1;i<=big;i++){
			for(int j=0;j<small;j++) {
				int reachgoal=(i*5)+(j*1);
				if(reachgoal==goal) {
					return j;
				}
			}
		}
		
		  return -1;
		 
		}
}





/* if((a==13||a==14||a==17||a==18||a==19) && (b==13||b==14||b==17||b==18||b==19) &&
  (c==13||c==14||c==17||c==18||c==19)){
    return 0;
  }
  else if(a==13||a==14||a==17||a==18||a==19){
    return b+c;
  }
  else if(b==13||b==14||b==17||b==18||b==19){
    return c+a;
  }
  else if(c==13||c==14||c==17||c==18||c==19){
    return b+a;
  }
  
  return a+b+c;*/
	
