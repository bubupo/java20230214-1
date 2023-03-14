package ch15.exercise.exam0507;

import java.util.*;

import ch15.exercise.exam0507.*;

public class Exam07 {
	public static void main(String[] args) {
	//	int[] array = {1,5,3,8,2};
		//of: 수정불가 리스트 리턴
		List<Integer> list = List.of(1,5,3,8,2);
		
		
		
		System.out.println(list);
		
		//위 리스트에서 최대값 구하는 코드 작성
		int max = Integer.MIN_VALUE; //math max max e
		for (Integer e : list) {
			
			System.out.println(max);
			max = Math.max(max, e);
		}
		System.out.println(max);
	}
}
