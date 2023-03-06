package ch07.lecture.p03cast;

public class C03Cast {
	public static void main(String[] args) {
		method1(new Animal());
		method1(new Hores());
		method1(new Fish());
		System.out.println("실행");
		
		
	}
	public static void method1(Animal a) {
		a.breath();
		
		if(a instanceof Hores){
		
		Hores h = (Hores) a;
		h.run();
		}
	}
}
