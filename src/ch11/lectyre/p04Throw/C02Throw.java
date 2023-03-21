package ch11.lectyre.p04Throw;

public class C02Throw {

	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void method1() throws Exception {
		
		throw new Exception();
	}
}




