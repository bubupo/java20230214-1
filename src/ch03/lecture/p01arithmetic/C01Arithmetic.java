package ch03.lecture.p01arithmetic;

public class C01Arithmetic {
	public static void main(String[] args) {
		//산술 연산자
		//+,-,*,/,%
		
		int i1 = 30;
		int i2 = 50;
		
		System.out.println(i1+i2);//더하기
		System.out.println(i1-i2);//빼기
		System.out.println(i1*i2);//곱하기
		System.out.println(i1/i2);//나누기
		System.out.println(i1%i2);//나머지 (modulo, remainder)
		
		
		double d1 = 3.14;
		double d2 = 9.9;
		
		System.out.println(d1+d2);
		System.out.println(d1-d2);
		System.out.println(d1*d2);
		System.out.println(d1/d2);

		//정수와 실수의 산술연산
		//결과는 실수
		int i3 = 10;
		double d3 = 3;
		
		System.out.println(i1+d3);
		System.out.println(i1-d3);
		System.out.println(i1*d3);
		System.out.println(i1/d3);
		
		//곱셈 나누기 가 더하기 빼기보다 우선순위가 높음  괄호사용 권장
		
		int i4 = 5 + 3 / 2; //6
		int i5 = 5 * 3 + 10; //25
		int i6 = 9 + 10 % 3; //10
		
		System.out.printf("%d, %d ,%d" ,i4, i5, i6);
		
		int i7 = 5+ (3/2);
		int i8 = (3*5) + 10;
		int i9 = 9+ (3%10);
		System.out.printf("%d, %d ,%d" ,i7, i8, i9);
		
		
		int i10 =(5 + 3) /2;//4
		int i11= 5*(3+10);//65
		int i12 =(9+10)%3;//1
		System.out.printf("%d, %d ,%d" ,i10, i11, i12);
		
	}
}
