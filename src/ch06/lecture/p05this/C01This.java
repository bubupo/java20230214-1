package ch06.lecture.p05this;

public class C01This {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.name = "SON";
		o1.printName();
		
		String now = o1.name;
	}
}
