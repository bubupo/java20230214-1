package ch05.lecture.p08regax;

public class C23Regax {
	public static void main(String[] args) {
		// . 
		// \.
		String pattern1 = ".";
		String pattern2 = "\\.";
		
		System.out.println("a".matches(pattern1));
		System.out.println("a".matches(pattern2));
		
		System.out.println(".".matches(pattern1));
		System.out.println(".".matches(pattern2));
		
		
		//영문 대소문자 여러개 .com으로 끝나는지
		String pattern3 = "[a-zA-Z]+\\.com";
		System.out.println("daum.com".matches(pattern3));
		System.out.println("daum.net".matches(pattern3));
		System.out.println("daumcom".matches(pattern3));
	}
}
