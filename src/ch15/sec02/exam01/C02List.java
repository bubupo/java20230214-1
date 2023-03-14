package ch15.sec02.exam01;

import java.util.*;

public class C02List {
	public static void main(String[] args) {
		//list 전체 탐색
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("react");
		
		System.out.println("for---=-=-=-=-=-=-=-=-=-=-=-");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("향상된 for문");
		for (String e : list) {
			System.out.println(e);
		}
		
		//Iterator
		System.out.println("Interator &&&&&&&&");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
		}
		
		//foeEach 메소드
		System.out.println("forEach 메소드 $$$$$$$$$$");
		list.forEach(e -> System.out.println(e));
		
		//forEach 메소드
		System.out.println("forEach 메소드 *********");
		list.forEach(System.out :: println);
	}
}
