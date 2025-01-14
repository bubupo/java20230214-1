package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C06Scanner {
	public static void main(String[] args) {
		String input = """
				14 30
				20""";
		
		Scanner scanner = new Scanner(input);
		
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		
		Scanner line1Scanner = new Scanner(line1);
		Scanner line2Scanner = new Scanner(line2);
		
		int currentHour = line1Scanner.nextInt();
		int currentMin = line1Scanner.nextInt();
		
		int pasMin = line2Scanner.nextInt();
		
		currentHour = (currentHour +(currentMin + pasMin) / 60) % 24;
		currentMin = (currentMin + pasMin)% 60;
		
		System.out.println(currentHour + " " + currentMin);
	}
}
