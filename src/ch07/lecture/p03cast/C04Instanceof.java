package ch07.lecture.p03cast;

public class C04Instanceof {
	public static void main(String[] args) {
		//instanceof 연산자
		//왼쪽항은 참조변소, 오른쪽은 Type
		//연산결과 boolean
		//true : 왼쪽항의 참조변수가 가리키는 객체가 오른쪽항 type이면 true 아니면 false
		
		Sub04 o1 = new Sub04();
		
		boolean b1 = o1 instanceof Sub04; //true
		boolean b2 = o1 instanceof Super04; //true
		
		System.out.println(b1);
		System.out.println(b2);
		
		Super04 o2 = new Super04();
		
		boolean b3 = o2 instanceof Super04; //true
		boolean b4 = o2 instanceof Sub04;//false
		
		System.out.println(b3);
		System.out.println(b4);
		
	}
}

class Sub04 extends Super04{
	
}

class Super04{
	
}
