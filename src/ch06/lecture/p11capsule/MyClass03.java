package ch06.lecture.p11capsule;

public class MyClass03 {
	private String name;
	private int age;
	private String address;
	private boolean married;
	private String num1;
	
	public void setMarried(boolean married) {
		this.married = married;
	}
	//boolean 차입의 setter 는 is로 시작
	public boolean isMarried() {
		return this.married = married;
	}
	
	
	//메소트 통해서 필드에 접근하도록
	public void setName(String name) {
		//변경
		this.name = name;
		
	}
	public String getName() {
		//읽기
		return this.name;
	}
	
	
	public void setAge(int age) {
		//변경
		this.age = age;
		
	}
	public int getAge() {
		//읽기
		return this.age;
	}
	
	
	public void setAddress(String address) {
		//변경
		this.address = address;
		
	}
	public String getAddress() {
		//읽기
		return this.address;
		
	}
}
