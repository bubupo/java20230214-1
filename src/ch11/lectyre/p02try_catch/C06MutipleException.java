package ch11.lectyre.p02try_catch;

public class C06MutipleException {
	public static void main(String[] args) {
		try {
			int[] a = {0,1};
			
			//ArithmeticException
			//ArrayIndexOutOfBoundsException
			int c = 1 / a[2];
			
		
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("countinue");
	}
}
