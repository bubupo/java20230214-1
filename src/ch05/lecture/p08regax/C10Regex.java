package ch05.lecture.p08regax;

public class C10Regex {
	public static void main(String[] args) {
		
		//quantifier 수량자
		
		//숫자 3개인가
		System.out.println("010".matches("[0-9][0-9][0-9]"));//true
		System.out.println("010".matches("[0-9]{3}"));//true
		System.out.println("123".matches("[0-9]{3}"));//true
		System.out.println("12".matches("[0-9]{3}"));//true
		System.out.println("1223".matches("[0-9]{3}"));//true
		System.out.println("ab3".matches("[0-9]{3}"));//true
	}
}
