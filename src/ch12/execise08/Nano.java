package ch12.execise08;

public class Nano {
	public static void main(String[] args) {
		long startNano = System.nanoTime();
		
		int[] scores = new int[1000];
		for ( int i =0; i< scores.length; i++) {
			scores[i] = i;
			
		}
		int sum = 0;
		for(int score:scores) {
			sum+= score;
			
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		
		long endNano = System.nanoTime();
		System.out.println(endNano - startNano);
	}
}
