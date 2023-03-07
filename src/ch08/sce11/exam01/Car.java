package ch08.sce11.exam01;

public class Car {
	//필드
	Tire tire1 = new HnakookTire();
	Tire tire2 = new HnakookTire();
	
	//메소드
	void run() {
	tire1.roll();
	tire2.roll();
}
}
