package ch07.lecture.p03cast;

public class C07Instanceof {
	public static void main(String[] args) {
		action(new Animal());
		action(new Hores());
		action(new Fish());
	}
	
	public static void action(Animal a) {
		a.breath();
		
		if(a instanceof Hores) {
			Hores h = (Hores)a;
			h.run();
		}else if(a instanceof Fish) {
			Fish f = (Fish)a;
			f.swim();
		}else {
			System.out.println("둘중 아무것도 해당하지 않음");
		}
	}
}
