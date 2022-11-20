
public class CodinBatString22 {

	public static void main(String[] args) {
		CodinBatString22 string22=new CodinBatString22();

		
		String output=string22.oneTwo("abcdefxy");
		System.out.println(output);

		String output1=string22.plusOut("12xy34xyabcxy", "xy");
		System.out.println(output1);
		
		String output2=string22.mixString("There", "xxxx");
		System.out.println(output2);

	
	}
	
	
	public String oneTwo(String str) {
		if(str.length()>=2) {
			String move="";
		for(int i=1;i<str.length();i++) {
			if(str.length()>i+1) {
			String firstthree=str.substring(i-1, i+2);
			//System.out.println("firstthree:"+firstthree);
			String movefirst=firstthree.substring(1)+firstthree.charAt(0);
		   // System.out.println(movefirst);
			i=i+2;
			move=move+movefirst;
			
		}}
		return move; 
		}
		else{
		return "";
		}
	}
	
	//12xy34xyabcxy xy
	public String plusOut(String str, String word) {

		String result = "";
		boolean found = false;
		String tempStr = "";
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<word.length();j++) {
				if(word.charAt(j)==str.charAt(i)) {
					found=true;
					tempStr=tempStr+str.charAt(i);
					//result=result+word.charAt(j);
					i++;
				}else {
					found = false;
					break;
				}
				
			}
			if(found) {
				result=result+tempStr;
				tempStr="";
				i--;
			}else {
				for(int x=0;x<tempStr.length();x++) {
					result = result+'+';
				}
				result=result+'+';
			}
			
				
			
		}
			
		return result;

	}
	//Hi There  HTihere
	public String mixString(String a, String b) {
		String result="";
		String result1="";
		int alen=a.length();
		int blen=b.length();
		
		if(alen==blen) {
			for(int i=0;i<a.length();i++) {
			result=result+a.charAt(i)+b.charAt(i);
		}
			result1=result;
		}
		if(alen>blen) {
			for(int i=0;i<b.length();i++) {
				result=result+a.charAt(i)+b.charAt(i);
				
			}
			result1=result+a.substring(b.length(),a.length());
		} if(alen<blen) {
			for(int i=0;i<a.length();i++) {
				result=result+a.charAt(i)+b.charAt(i);
				
			}
			result1=result+b.substring(a.length(),b.length());
		}
		
		return result1;
	
	}
	
}
