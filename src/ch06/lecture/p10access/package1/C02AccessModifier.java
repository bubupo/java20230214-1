package ch06.lecture.p10access.package1;

import ch06.lecture.p10access.MyClass01;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		MyClass01 o2 = new MyClass01();
		
		System.out.println(o2.nan);
		System.out.println(o1.name);
//		System.out.println(o1.age); //접근불가
		System.out.println(o1.married); //접근 불가
		o1.method1();
		o1.method3(); //접근불가능
//		o1.method2(); //접근 불가능
	}
}
