package ch04.lecture.p03while;

public class C02While {
	public static void main(String[] args) {
		System.out.println("이전 실행문");
		
		int i = 0;
		while (i < 3) {
			System.out.println("세번만 실행되어라 얍");
			i++;
		}
		System.out.println("다음 실행문..");
	}
}
