package ch05.lecture.p08regax;

public class C16Regex {
	public static void main(String[] args) {
		//{0,1}
		// ? : 0개 또는 1개
		
		String patern1 = "[0-9]{0,1}";
		String patern2 = "[0-9]?";
		
		System.out.println("0".matches(patern1));
		System.out.println("0".matches(patern2));
		
		System.out.println("".matches(patern1));
		System.out.println("".matches(patern2));
		
		System.out.println("a".matches(patern1));
		System.out.println("a".matches(patern2));
		
		System.out.println("00".matches(patern1));
		System.out.println("00".matches(patern2));
	}
}
