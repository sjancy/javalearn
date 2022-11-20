package com.jancy.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		//List<Character> character=List.of('A','B');
		ArrayList<Character> character=new ArrayList<Character>();
		
		character.add('A');
		character.add('Z');
		character.add('A');
		character.add('B');
		character.add('Z');
		character.add('F');
		
		System.out.println(character);
		
		Set<Character> treeSet=new TreeSet<>(character);//this is sorting order
		
		System.out.println("treeSet:" +treeSet);
		
		Set<Character> linkedHashSet=new LinkedHashSet<>(character);
		
		System.out.println("linkedHashSet:"+linkedHashSet);//this is insertion order
		
	}

}
