package ch15.lecture.p03set;

import java.util.*;

public class C03Iterator {
	public static void main(String[] args) {
		//iterator
		//collection 탐색을 위한 객체의 타입
		//hashNext : 다음 탐색할 원소가 있는지?
		//next : 다음 원소 리턴
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		
		//remove : 특정 원소 지우기
		
		//조건에 따른 원소 지우기
		
		//향상된 for문 사용시 set이 변경되면
		//오류 발생
//		for (String e: set) {
//			if(e.length() % 2 == 0) {
//				set.remove(e);
//			}
//		}
		
		//따라서 지우는 목적으로 탐색한다면 Iterator.remove 상ㅇ
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String n = iter.next();
			
			if((n.length() % 2) == 0) {
				iter.remove();
			}
		}
		System.out.println(set);
 	}
}
