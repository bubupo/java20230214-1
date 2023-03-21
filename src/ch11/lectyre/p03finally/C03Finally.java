package ch11.lectyre.p03finally;

public class C03Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			if(a) {
				return;
			}
			//catch 블록이 있어야만 finally블록을 실행할 수 있는건 아님
		}finally {
			System.out.println("finally block");
		}
	}
}
