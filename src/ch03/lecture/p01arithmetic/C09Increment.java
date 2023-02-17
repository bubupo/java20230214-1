package ch03.lecture.p01arithmetic;

public class C09Increment {
	public static void main(String[] args) {
		//증가 연산자(++)
		//감소연산자(--)
		
		int x = 1;
		int y = 1;
		 
		x++; //x는2가됨
		++x;//x가 3이됨
		
		y--;//y는 0이됨
		--y;//y가 -1이 됨
		System.out.printf("%d, %d%n", x, y);//x=3 y=-1
		
		int z = x++ + 10; // 13
		int w = ++y + 10;//10
		
		System.out.printf("%d, %d%n",z,w );
		
				
	}
}
