package ch06.sec13.exam03.packge1;

public class B {
	public void method() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1; //x
		a.field2 = 2; //o
		//a.field3 = 3; //x
		
		//메소드 호출
		a.method1(); //o
		a.method2(); //o
	//	a.method3(); //x
	}
}
