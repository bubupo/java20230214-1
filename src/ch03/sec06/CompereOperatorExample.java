package ch03.sec06;

public class CompereOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("reuslt1 :" + result1);
		System.out.println("reuslt2 :" + result2);
		System.out.println("reuslt3 :" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);			//65  <  66
		System.out.println("reuslt4 :" + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("reuslt5 :" + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		System.out.println("reuslt6 :" + result6);
		System.out.println("reuslt7 :" + result7);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("reuslt8 :" + result8);
		System.out.println("reuslt9 :" + result9);
		
		
	
		
	
	}
}