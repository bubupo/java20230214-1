package ch11.lectyre.p04Throw;

public class C05Throw {
	public static void main(String[] args) {
		
	}
	
	public static void method2() throws Throwable {
		throw new ClassNotFoundException();
	}
	
	public static void method1() throws RuntimeException {
		
		throw new ClassCastException();
	}
}
