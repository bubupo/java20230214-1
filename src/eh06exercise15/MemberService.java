package eh06exercise15;

public class MemberService {
	public boolean login(String id, String string2){
		
		return id.equals("hong")&& string2.equals("12345");
	}
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
