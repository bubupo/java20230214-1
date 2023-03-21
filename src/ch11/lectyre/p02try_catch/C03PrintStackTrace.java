package ch11.lectyre.p02try_catch;

public class C03PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a= 0;
			int b = 3;
			
			int c = b/a;
			System.out.println("try block continue..");
		}catch (ArithmeticException e) {
			//catch block
			//System.out.println("오류");
			e.printStackTrace();
		}
		System.out.println("continue");
	}
}
