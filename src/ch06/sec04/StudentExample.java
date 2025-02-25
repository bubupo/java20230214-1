package ch06.sec04;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객제를 참조합니다");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객제를 참조합니다");
		
		System.out.println(s1 == s2); //false
		
		//참조값얻기 : System.identityHashCode
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s1));
	}
}
