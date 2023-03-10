package ch07.lecture.p03cast;

public class C09Instanceof {
	public static void main(String[] args) {
		action(new Animal());
		action(new Hores());
		action(new Fish());
	}
	
	public static void action(Animal a) {
		a.breath();
		
		if(a instanceof Hores h) {
			h.run();
		}else if(a instanceof Fish f) {
			f.swim();
		}else {
			System.out.println("아무것도 아니다");
		}
	}
}