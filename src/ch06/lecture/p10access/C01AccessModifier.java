package ch06.lecture.p10access;

import ch06.lecture.p10access.MyClass01.*;

public class C01AccessModifier {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		
		System.out.println(o1.name); //접근 가능
		//System.out.println(o1.age); //접근 불가능
		
		o1.method1(); //실행 가능
		//o1.method2(); //실행 불가능
	}
}
