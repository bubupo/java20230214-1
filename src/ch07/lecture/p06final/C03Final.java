package ch07.lecture.p06final;

public class C03Final {

}

class Super03{
	final public void method1() {
		//final method 는 하위 클래스에서 재정의 할 수 없음
		
	}
	public void method2() {
		
	}
}

class Sub03 extends Super03{
	@Override
	public void method1() {
		System.out.println("재정의");
	}
}