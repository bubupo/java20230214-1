package ch06.sec08.exam02;

public class Computer {
	//가변 길이 배개변수를 갖는 메소드 선언
	int sum(int ... values) { //int 타입을 여러개(...) 받는다 values(배열)
		//sum변수선언
		int sum = 0;
		
		//values는 배열 타입의 변수처럼 사용
		for(int i = 0; i < values.length; i++) {
			sum+= values[i];
		}
		
		//하산 결과를 리턴
		return sum;
	}
}
