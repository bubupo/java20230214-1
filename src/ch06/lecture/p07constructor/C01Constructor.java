package ch06.lecture.p07constructor;

public class C01Constructor {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		//인스턴스 만들자 마자 해야할 일
		o1.name = "son";
		o1.age = 90;
		
		
		MyClass01 o2 = new MyClass01();
		o2.name = "park";
		o2.age = 60;
		
		
		o1.descript();
		o2.descript();
		
	}
}
