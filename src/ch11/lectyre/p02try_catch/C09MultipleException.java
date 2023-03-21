package ch11.lectyre.p02try_catch;

public class C09MultipleException {
	public static void main(String[] args) {
		try {
			//여러 exception 발생가능
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
		
	}
}
