package ch12.lecture.p01object;

public class C06ToString {
	public static void main(String[] args) {
		Object o1 = new MyClass06("son",77);
		Object o2 = new MyClass06("park",57);
	}
}

class MyClass06{
	private String name;
	private int age;
	
	MyClass06(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "나이는" + age + "이고 이름은"+name+"입니다";
	}
}
