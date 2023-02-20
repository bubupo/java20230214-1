package ch04.exercise;

public class Ch04DoWhileExercise {
	public static void main(String[] args) {
		int score;
		int score2;
		
		
		do {
		score = ((int)(Math.random()*6)) + 1;
			
		score2 = ((int)(Math.random()*6)) + 1;
			
			System.out.printf("(%d, %d)%n", score, score2);
		}while ((score + score2) !=5);
		
	}
}
