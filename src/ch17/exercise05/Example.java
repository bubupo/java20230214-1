package ch17.exercise05;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is  java book",
				"Lambda Experssions",
				"Java8 supports lambda expresions"
				
				);
		for(String e : list) {
			if(e.toLowerCase().contains("java")) {
				System.out.println(e);
			}
		}
		
		System.out.println();
		
		
		list.stream()
				.filter(Example::havinJava)
				.forEach(n -> System.out.println(n));
				System.out.println();
				
		
	}
	
	private static boolean havinJava(String s) {
		return s.toLowerCase().contains("java");
	}
}
