package ch06.lecture.p10access.package1;

public class C03AccessModifier {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		
		//private 이여서 안됨
		MyClass03 o2 = new MyClass03(5);
		
		MyClass03 o3 = new MyClass03("java");
	}
}
