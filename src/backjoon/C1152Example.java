package backjoon;

import java.util.Scanner;

public class C1152Example {
	public static void main(String[] args) {
		String input2 = "The last character is a blank ";
		Scanner scanner = new Scanner(input2);
		
		
		String line = scanner.nextLine();
		
		String[] arr= line.split(" ");
		int answer = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(!arr[i].equals(" ")) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
