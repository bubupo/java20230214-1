package ch05.lecture.p02reference;

public class Co4Reference {
	public static void main(String[] args) {
		int[] arr = {3,4,5};
		
		method1(arr);
		System.out.println(arr[0]);
	}
	public static void method1(int[] arr2) {
		System.out.println(arr2[0]);
		arr2[0] = 30;
		System.out.println(arr2[0]);
	}
}
