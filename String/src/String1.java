
public class String1 {

	public static void main(String[] args) {
		String str="Jancy Jerin";
		System.out.println(str.substring(0, 5));
		String str1=str.concat(" Samuel");
		System.out.println(str1);
		
		if(str.endsWith("in")) {
			System.out.println("true");
		}else
		{
			System.out.println("False");
			
			
		}
        
		
		System.out.println(str.substring(1,4));
		for(int i=0;i<3;i++) {
			System.out.println(str.substring(0,2));
		}
		
		String a="Jancy";
		String b="Jerin";
		String c=a.concat(b).concat(b).concat(a); 
		
		System.out.println(c);
        
          
        System.out.println(a.substring(1,4));

	
		
	}

}
