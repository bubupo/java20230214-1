package ch05.lecture.p08regax;

public class C11Regex {
	public static void main(String[] args) {
		//010으로시작하고 - 기호  숫자 4개 - 기호 숫자 4개
		
		String pattern = "010-[0-9]{4}-[0-9]{4}";
		
		System.out.println("010-9999-7777".matches(pattern)); //true
		System.out.println("010-9999-7777".matches(pattern)); //true
		System.out.println("010-99997777".matches(pattern)); //false
		System.out.println("010-9999-777".matches(pattern)); //false
	}
}
