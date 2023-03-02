package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass05;

import static ch06.lecture.p09package.package1.MyClass05.name;
import static ch06.lecture.p09package.package1.MyClass05.method1;
import static ch06.lecture.p09package.package1.MyClass05.method2;

//static import
//:static 멤버 field, method

public class C05StaticImport {
	public static void main(String[] args) {
		
		String n = name;
		
		method1();
		method2();
	}
}
