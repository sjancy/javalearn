package com.jancy.FunctionalProgramming;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingBatFunctionalProgramming {

	public static void main(String[] args) {
		
		CodingBatFunctionalProgramming cb=new CodingBatFunctionalProgramming();
		
		List value=List.of(1,2,3);
		List<Integer> output=cb.doubling(value);
		System.out.println(output);
	

		List value1=List.of("a", "bb", "ccc");
		List<String> output1=cb.addStar(value1);
		System.out.println(output1);


		List value2=List.of(1,-2);
		List<Integer> output2=cb.noNeg(value2);
		System.out.println(output2);
		

		
		List value3=List.of(12, 13, 19, 20);
		List<Integer> output3=cb.noTeen(value3);
		System.out.println(output3);


	
	
	
	}
	

	public List<Integer> doubling(List<Integer> nums) {
		
		return nums.stream().map(n->n*2).collect(Collectors.toList());
		  
	}
	
	
	public List<String> addStar(List<String> strings) {
		
		return strings.stream().map(n->n+"*").collect(Collectors.toList());
		
		
	}
	
	
	public List<Integer> noNeg(List<Integer> nums) {
		  return nums.stream().filter(n->n>=0).collect(Collectors.toList());
		}
	
	
	
	public List<Integer> noTeen(List<Integer> nums) {
		  return nums.stream().filter(n->n<=12 && n>=20).collect(Collectors.toList());
		}


	


}
