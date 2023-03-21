package ch11.lectyre.p02try_catch;

public class C07MutipleException {
	try {
		int[] a = {0,1};
		
		//ArithmeticException
		//ArrayIndexOutOfBoundsException
		int c = 1 / a[2];
		
	
	} catch (Thread e) {
		e.printStackTrace();
	}
	System.out.println("countinue");
}
}
