package ch16.lecture.p01anonymous;

public class C02Lamda {
	public static void main(String[] args) {
		MyInterface02 o1 = () -> System.out.println("재정의한 메소드");
		o1.method1();
	}
	
}

interface MyInterface02{
	void method1();
}