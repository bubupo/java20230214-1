package exercise13;

public class Member {
	public String name;
	String id;
	private String pw;
	private int age;
	private boolean married;
	
	public Member (String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getId() {
		return id;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
	
	

}
