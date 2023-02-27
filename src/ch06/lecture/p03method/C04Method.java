package ch06.lecture.p03method;

public class C04Method {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		o1.method1();
		
		
		//메소드 실행시 정의된 파라미터 타입과 순서 개수에 맞춰서
		//아규먼트 입력 전달
		o1.method2(5); //()안에 int타입이 있어야됨
		
		o1.method3("hello");
		
		int s3 = 100;
		String s1= "java";
		
		o1.method3(s1);
		o1.method3(null);
		String s2= null;
		o1.method3(s2);
		
		o1.method4(5,"java");
		
		o1.method5("son","nam");
		
		o1.method6("css", 6);
		
		o1.method7(78, 90);
		
		o1.method4(s3,s1);
		
		o1.method5(s1,s1);
		
		o1.method6(s1, s3);
		
		o1.method7(s3, s3);
		
		
	}
}
