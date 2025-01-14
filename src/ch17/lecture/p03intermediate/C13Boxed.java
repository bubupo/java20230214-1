package ch17.lecture.p03intermediate;

import java.util.stream.*;

public class C13Boxed {
	public static void main(String[] args) {
		//boxed:
		//기본 타입을 원소로 갖는 stream
		// --->참조타입을 원소가 갖는 stream 변환
		
		IntStream stream1 = IntStream.range(1, 10);
		Stream<Integer> stream2 = stream1.boxed();
		
		DoubleStream strem3 = DoubleStream.of(3.14, 9.99);
		Stream<Double> strem4 = strem3.boxed();
	}
}
