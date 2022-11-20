package com.jancy.codingbat.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCount {

	public static void main(String[] args) {
		
	MapCount mc=new MapCount();
	
	String[] array=new String[] {"a", "b", "a", "c", "b"}; 
	Map<String, Integer> result=mc.wordCount(array);
	System.out.println(result);
	
	String[] array1=new String[] {"salt", "tea", "soda", "toast"};	
	Map<String,String> result1=mc.firstChar(array1);
	System.out.println(result1);
	

	String[] array2=new String[] {"a", "b", "a", "c", "b"};	
	Map<String,Boolean> result2=mc.wordMultiple(array2);
	System.out.println(result2);


	String[] array3=new String[] {"ab", "bc", "ac"};
	String[] result3=mc.allSwap(array3);
	System.out.println(List.of(result3));

	
	}

//wordcount	
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap();
		for (String s : strings) {
			if (map.containsKey(s)) {
				int varCount = map.get(s);
				varCount++;
				map.put(s, varCount);
			} else {
				map.put(s, 1);
			}
		}
		return map;
	}
	
	//firstchar
	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap();
		for(String s:strings) {
			String value=s.charAt(0)+"";
			///System.out.println(value);
			if(map.containsKey(value)) {
				String result=map.get(value);
				map.put(value,result+s);		}
			else {
				//System.out.println("value: "+value+"; s: "+s);
				map.put(value,s);
		}}
		  
		return map;
	}
	
	//wordmultiple
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap();
		for(String s:strings) {
			if(!map.containsKey(s)) {
			  map.put(s, false);
				
			}
			else
			
			map.put(s, true);
		}
		return map;
		  
	}

	//allswap   //input "ab", "bc", "ac"
	public String[] allSwap(String[] strings) {
		Map<String, Integer> map = new HashMap();

		for (int indexOfCurrent = 0; indexOfCurrent < strings.length; indexOfCurrent++) {

			String startingAlphabet = strings[indexOfCurrent].charAt(0) + "";
			if (map.containsKey(startingAlphabet)) {
				int indexOfOtherString = map.get(startingAlphabet);
				String stringToSwapTemp = strings[indexOfOtherString];
				strings[indexOfOtherString]= strings[indexOfCurrent];
				  //input "ac", "bc", "ac"
				
				strings[indexOfCurrent] = stringToSwapTemp;
				//input "ac", "bc", "ab"
				map.remove(startingAlphabet);

			} else {
				map.put(startingAlphabet, indexOfCurrent);

			}

		}
		return strings;

	}

	
	

}
