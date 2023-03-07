package ch08.exeample06;

import ch08.sce11.exam02.*;

public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	Cat cat = new Cat();
	Dog dog = new Dog();
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
	}
}
