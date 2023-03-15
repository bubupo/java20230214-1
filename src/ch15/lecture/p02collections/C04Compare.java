package ch15.lecture.p02collections;

import java.util.*;

public class C04Compare {
	public static void main(String[] args) {
		var list = new ArrayList<Person04>();
		list.add(new Person04("kang", "20230315")); // 1
		list.add(new Person04("seo", "20211203")); // 2
		list.add(new Person04("chae", "20020605")); // 5
		list.add(new Person04("song", "20121203")); // 4
		list.add(new Person04("jung", "20210707")); // 3

		// 나이순 정렬(나이가 어릴수록 작은 인덱스
		// Collections.sort(list
		// Collections.sort(list, (a, b) -> 0);

		Collections.sort(list, (a, b) -> 0);
		System.out.println(list);
	}
}

class Person04 implements Comparable<Person04> {
	private String name;
	private String birth;
	
	// toString
	@Override
	public String toString() {
		return "[" + name + birth + "]";
	}

	// conturctor
	public Person04(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	// geeters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}


	}

