package ch07.lecture.p07sealed;

public class C02Sealed {
	
}

sealed class  Super02 permits Sub021{}


//상속받은 클래스는 다시sealed로 선언가능하다.
sealed class Sub021 extends Super02 permits Sub0211{}

final class Sub0211 extends Sub021{}