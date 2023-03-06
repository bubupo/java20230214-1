package ch07.lecture.p03cast;

public class C01Cast {
	public static void main(String[] args) {
		Animal a1 = new Hores();
		a1.breath();
	//	a1.run();//x
		
		Hores h1 = (Hores) a1; //강제 형변환
		h1.run();
		
		
		Animal a2 = new Fish();
		a2.breath();
		
		
		Fish f1 = (Fish) a2;
		f1.swim();
	//	a2.swim();//x
	}
}

class Fish extends Animal{
	@Override
	public void breath() {
		System.out.println("아가미호흡한다.");
	}
	
	public void swim() {
		System.out.println("헤엄칩니다.");
	}
}

class Hores extends Animal{
	@Override
	public void breath() {
		System.out.println("폐호흡한다.");
	}
	
	public void run() {
		System.out.println("달립니다.");
	}
}

class Animal{
	public void breath() {
		System.out.println("호흡한다.");
	}
}
