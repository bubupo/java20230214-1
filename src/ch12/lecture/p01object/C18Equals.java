package ch12.lecture.p01object;

public class C18Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 =o1;
		
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		
		System.out.println(o3.equals(o1));
		System.out.println(o3.equals(o2));
		
	}
}
