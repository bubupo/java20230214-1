package ch16.lecture.p02lambda;

public class C02Lambda {
	public static void main(String[] args) {
		//파라미터가 없으면 빈()사용
		//메소드 body는 {}
		MyInterface02 o1 = ()-> {
			//메소드 body
			System.out.println("메소드 작성 body");
		};
		o1.method();
		
		//메소드이 명령문아 하나이면 중괄호 생략 가능
		MyInterface02 o2 = () ->{
			System.out.println("명령문 여러가지1");
			System.out.println("명령문 여러가지2");
		};
		//생략 가능하면 생략하기
		MyInterface02 o3 = () -> System.out.println("명령문 하나");
	}
}

@FunctionalInterface
interface MyInterface02{
	//파라미처가 없는 추상 메소드
	void method();
}