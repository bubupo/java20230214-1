package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C02Limit {
	public static void main(String[] args) {
		//limit  중간연산 : 크기제한
		
		List<String> list1 = List.of("java","css", "html", "spring", "jsp");
		
		Stream<String> stream1 = list1.stream();
		Stream<String> stream2 =  stream1.limit(3); //스트림 원소 중 3개로 제한
		
		long count = stream2.count();
		
		System.out.println(count);
		
		//메소드 chaining
		long count2 = list1.stream()
				.limit(3)
				.count();
		
		System.out.println(count2);
	
	}
}
