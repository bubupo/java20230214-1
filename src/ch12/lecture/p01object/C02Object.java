package ch12.lecture.p01object;

import java.util.*;

import ch06.lecture.p06final.*;

public class C02Object {
	public static void main(String[] args) {
		//오브젝트에 있는 메소드는 모든클래스가 가지고있다.
		String s = "java";
		s.toString();
		s.hashCode();
		s.equals("");
		
		Scanner sc = new Scanner("");
		sc.toString();
		sc.hashCode();
		sc.equals(null);
		
		MyClass02 o1 = new MyClass02();
		o1.toString();
		o1.hashCode();
		o1.equals("");
	}
}

class MyClass02{
	
}
