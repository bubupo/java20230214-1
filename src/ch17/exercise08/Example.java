package ch17.exercise08;

import java.util.*;

public class Example {
	
	public static void main(String[] args) {
		List<Member> list = List.of(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		Map<String, List<Member>> map = new HashMap<>();

		// code..
		for (Member member : list) {
			List<Member> val = map.get(member.getJob());
			
			if (val == null) {
				val = new ArrayList<>();
				map.put(member.getJob(), val);
			}
			val.add(member);
		}

		System.out.println("[개발자]");
		List<Member> dev = map.get("개발자");
		for (Member d : dev) {
			System.out.println(d);
		}

		System.out.println();

		System.out.println("[디자이너]");
		List<Member> des = map.get("디자이너");
		for (Member d : des) {
			System.out.println(d);
		}

	}
}
