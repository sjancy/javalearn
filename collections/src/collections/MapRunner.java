package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str="My name is Jancy, I am learning Java";
		Map<Character, Integer> occurances=new HashMap<>();
		
		char[] characters=str.toCharArray();
		
		for(char character:characters) {
			
			Integer integer=occurances.get(character);
			if(integer==null) {
				occurances.put(character, 1);
			}
			else
				occurances.put(character, integer+1);
		}
		

		System.out.println(occurances);
		
		
		
		Map<String, Integer> stringOccurances=new HashMap<>();
		
		String[] words=str.split( " ");
		
		for(String word:words) {
			
			Integer integer=occurances.get(word);
			if(integer==null) {
				stringOccurances.put(word, 1);
			}
			else
				stringOccurances.put(word, integer+1);
		}
		

		System.out.println(stringOccurances);
	}
	


}
