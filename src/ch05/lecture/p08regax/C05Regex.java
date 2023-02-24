package ch05.lecture.p08regax;

public class C05Regex {
	public static void main(String[] args) {
		//character class
		
		System.out.println("a".matches("[abcdefghijklmnopqrstuvwxyz]"));
		System.out.println("b".matches("[abcdefghijklmnopqrstuvwxyz]"));
		System.out.println("c".matches("[abcdefghijklmnopqrstuvwxyz]"));
		System.out.println("d".matches("[abcdefghijklmnopqrstuvwxyz]"));
		
		System.out.println("a".matches("[a-z]"));
		System.out.println("a".matches("[a-z]"));
		System.out.println("a".matches("[a-z]"));
		System.out.println("a".matches("[a-z]"));
	}
}
