package ch05.lecture.p08regax;

public class C22Regax {
	public static void main(String[] args) {
		//모든 문자
		//.
		String pattern1 = ".";
		
		System.out.println("a".matches(pattern1));
		System.out.println("z".matches(pattern1));
		System.out.println(" ".matches(pattern1));
		System.out.println("\n".matches(pattern1));
		
		String pattern2 = ".{3}"; //어떤문자는 3개로 이루어져 있다.
		System.out.println("가나다".matches(pattern2));
		System.out.println("   ".matches(pattern2));
		System.out.println("가 a".matches(pattern2));
	}
}
