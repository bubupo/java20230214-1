package ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
	sumThread.start();
	
	try {
		sumThread.join();
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	System.out.println("1~100의 합" +sumThread.getSum());
	}
}
