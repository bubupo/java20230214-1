package exercise18;

public class Exam18 {
	public static void main(String[] args) {
		ShopService dbj1 = ShopService.getInstance();
		ShopService dbj2 = ShopService.getInstance();
		
		if(dbj1 == dbj2) {
			System.out.println("같은 ShopService 객체 입니다");
			
		}else {
			System.out.println("다른 ShopService 객체 입니다");
		}
	}
	
	
}
