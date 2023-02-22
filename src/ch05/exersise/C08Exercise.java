package ch05.exersise;
public class C08Exercise {
	public static void main(String[] args) {
		int[][] arry = {
				{95, 86},
				{83, 92, 96 },
				{78, 83, 93, 87, 88},
		};
		
		int sum = 0;
		double cnt = 0;
		for(int i = 0; i< arry.length; i++) {
			
			for(int j = 0; j < arry[i].length; j++) {
				
				sum += arry[i][j];
				cnt ++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/cnt);
	}
}
