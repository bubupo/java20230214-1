package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C10ToCharArray {
	public static void main(String[] args) {
		//string 의 tochararray
		String str1 = "hello world";
		String[]arr1 = str1.split("");
		
		System.out.println(Arrays.toString(arr1));
		
		char[] arr2 = str1.toCharArray();
		
		System.out.println(Arrays.toString(arr2));
	}
}
