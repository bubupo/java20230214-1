package ch15.lecture.p03set;

import java.util.*;

public class C04Contains {
	public static void main(String[] args) {
		Set<String> set = Set.of("java", "css", " html", "jsp");
		
		//contains :해당 원소가 이ㅣㅁ 있는지?
		System.out.println("java");
		System.out.println("jsp");
		System.out.println("python");
		System.out.println(new String("java"));
	}
}
