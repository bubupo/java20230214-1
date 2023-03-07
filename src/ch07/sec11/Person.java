package ch07.sec11;

public sealed class Person permits Employee, Manager {

	//필드
	public String name;
	
	//메솓
	
	public void work() {
		System.out.println("하는일이 결정되지 않았다.");
	}
}
