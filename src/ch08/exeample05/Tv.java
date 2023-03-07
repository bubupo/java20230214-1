package ch08.exeample05;

public class Tv  implements Remocon{
	
	@Override
	public void powerOn(){
		System.out.println("tv를 켰습니다.");
	}
	
	public static void main(String[] args) {
		Remocon r = new Tv();
		r.powerOn();
		
	}
}
