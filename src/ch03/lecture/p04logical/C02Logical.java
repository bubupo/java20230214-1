package ch03.lecture.p04logical;

public class C02Logical {
	public static void main(String[] args) {
		//^(xor : exclusive or (배타적 논리합))
		//피연산자가 다르면 결과  true 같으면 false
		//서로 다르면 true
		System.out.println(true^true); //false
		System.out.println(true^false); //true
		System.out.println(false^true); //true
		System.out.println(false^false); //false
		
		// & (and)
		//피연산자가 모두 true이면 true
		// 나머지는 false 곱하기
		System.out.println(true&true);//true
		System.out.println(false&true);//false
		System.out.println(true&false);//false
		System.out.println(false&false);//false
		
		
		//| (or)
		//피연산자가 모두 false이면 false
		//나머지는 true 더하기
		System.out.println(true| true);//true
		System.out.println(false| true);//true
		System.out.println(true| false);//true
		System.out.println(false| false);//false
	}
}
