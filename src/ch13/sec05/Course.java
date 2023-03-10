package ch13.sec05;

public class Course {
	public static void registerCoures1(Applicant<?>applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + 
				"이(가) Course1를 등록함");
	}
	
	public static void registerCoures2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이(가) Course2를 등록함");
	}
	public static void registerCoures3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이(가) Course3를 등록함");
	
}
}
