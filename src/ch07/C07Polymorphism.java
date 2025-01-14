package ch07;

public class C07Polymorphism {
	public static void main(String[] args) {
		Animal a1 = new Hores();
		Animal a2 = new Fish();
		
		a1.breath();
		a2.breath();
	}
}


class Animal{
	public void breath() {
		System.out.println("호흡한다.");
	}
}

class Hores extends Animal {
	@Override
	public void breath() {
		System.out.println("폐로 호흡한다.");
	}
}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미로 호흡한다.");
	}
}