package ch02.lecture.p02type;

public class C11Conversion {
	public static void main(String[] args) {
		int i1 ;
		long l1;
		
		i1 = 100;
		l1 = i1;
		
		float f1;
		double d1;
		
		f1 = 3.14F;
		d1 = f1; 
		
		//정수 타임간에 작은타입 큰타입 자동 형변환

		//정수에서 실수로 : 자동 형변환
		
		int i2;
		double d2; 
		
		
		i2 = 999999;
		d2 = i2; //정수에서 실수로 자동변환
		
		long l2; //8bytes
		l2 = 999999999999L;
		d2 = l2; //정수에서 실수로 자동변환
		
		System.out.println(d2);
		
		float f2; //4bytes
		f2 = l2;	//정수에서 실수로 자동변환
		System.out.println(f2); //주의!
		
		//문자 char 에서 정수 int long 으로 자동 형변환
		char c3 = '가'; //2bytes
		int i3 = c3; //자동 형변환
		long l3 = c3; //자동 형변환
		
	}
}
