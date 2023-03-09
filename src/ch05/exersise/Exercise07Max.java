package ch05.exersise;

public class Exercise07Max {
public static void main(String[] args) {
		
		int[] answer = {1,5,3,8,2};
		
		int max = Integer.MIN_VALUE;
		
		for(int n : answer) {
			max = Math.max(max, n);
		}
		System.out.println(max);
}	
}
