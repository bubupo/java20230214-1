package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 93));
		studentList.add(new Student("홍길동", 87));
		
		//Student를 score스트림으로 변환
		studentList.stream()
			.mapToInt(s-> s.getScore())
			.forEach(score -> System.out.println(score));
		
		
		/// max
		int max = studentList.stream()
				.mapToInt(Student::getScore)
				.max()
				.getAsInt();
		System.out.println(max);
		// min
		int min = studentList.stream()
				.mapToInt(Student::getScore)
				.min()
				.getAsInt();
		System.out.println(min);

		// sum
		int sum = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		System.out.println(sum);

		// average
		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		System.out.println(avg);
		
		
		//최대 최소 값 평균 총합
		
		IntSummaryStatistics statistics = studentList
	            .stream()
	            .mapToInt(num -> num.getScore())
	            .summaryStatistics();

	    System.out.println("합계: " + statistics.getSum());
	    System.out.println("평균: " + statistics.getAverage());
	    System.out.println("최소: " + statistics.getMin());
	    System.out.println("최대: " + statistics.getMax());
	    System.out.println("개수: " + statistics.getCount());
	}
}
