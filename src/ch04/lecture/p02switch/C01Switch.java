package ch04.lecture.p02switch;

public class C01Switch {
	public static void main(String[] args) {
		//switch
		//값에 따라 실행 흐름을 변경할 때 사용
		
		System.out.println("이전 실행문..");
		
		int val = 1;
		
		switch (val) {
		case 1:
			System.out.println("code1");
			break;
		case 2:
			System.out.println("code2");
			break;
		case 3:
			System.out.println("code3");
			break;
		default:
			System.out.println("code4");
			break;
		}
		
		if (val == 1) {
			System.out.println("code1");
		}else if(val ==2) {
			System.out.println("code2");
		}else if(val == 3) {
			System.out.println("code3");
		}
		System.out.println("다음 흐름..");
	}
}