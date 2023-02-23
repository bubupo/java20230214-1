package ch05.exersise;

public class C07Exercise {
	public static void main(String[] args) {
		
		int answer = 0;
		
		int[] arr = {1,5,3,8,2};
		for (int i = 0; i < arr.length; i++) {
			//내가 알고있는 수보다 크면
			if(answer < arr[i]) {
				answer = arr[i];
			}
			
			
		}
		System.out.println(answer);
	}
}
