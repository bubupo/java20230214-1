package ch05.lecture.p01array;

public class C02Array {
	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[3];
		
		double[] arr2;
		arr2 = new double[2];
		
		arr2[0] = 3.14;
		arr2[1] = 4.99;
		
		char[] arr3;
		arr3 = new char[3];
		arr3[0] = '가';
		arr3[1] = 'a';
		arr3[2] = '나';
		
		int[] arr4 = new int[5];
		arr4[0] = 100;
		arr4[1] = 200;
		arr4[2] = 300;
		arr4[3] = 400;
		arr4[4] = 500;
		
		String[] arr5 = new String[2];
		arr5[0]= "hello";
		arr5[1]= "java";
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
	}
}
