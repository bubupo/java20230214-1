package ch11.lectyre.p04Throw;

public class C11Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException {
		Class.forName("");
	}
}
