package ch09.lecture.p01nested;

public class C04LocalClass {
	void method1() {
		class LocalClass1{  //선언된 메소드 내에서만 사용가능
			
		}
		LocalClass1 o1 = new LocalClass1();
	}
	void method2() {
		LocalClass1 o1 = new LocalClass1();//x
	}
}
