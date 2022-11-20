package com.jancy.FunctionalProgramming;

import java.util.List;

public class MethodreferebceRunner {
	
	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Cat","Bat","Dog", "Elephant").stream()
		        .map(s->s.length()).forEach(s->System.out.println(s));
		
		        //or
		
		List.of("Cat","Bat","Dog", "Elephant").stream()
        .map(String::length)//or map(s->s.length())
        .forEach(MethodreferebceRunner::print);
            //this is called methodReference
		
		
		/*Integer max=List.of(23,45,63,34).stream()
				      .filter(n->n % 2 ==0)
				      .max((n1,n2)->Integer.compare(n1,n2))
				      .orElse(0);
				      
		System.out.println(max);*/
		
		
		//usung methodreference
		
		Integer max=List.of(23,45,63,34).stream()
			      .filter(MethodreferebceRunner::isEven)
			      .max(Integer::compare)
			      .orElse(0);
			      
	System.out.println(max);
		
	}
	
	public static boolean isEven(Integer number) {
		return number%2==0;
	}

}
