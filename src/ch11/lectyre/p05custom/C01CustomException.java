package ch11.lectyre.p05custom;

import java.awt.geom.*;



public class C01CustomException {
	public static void main(String[] args) {
		String menu = null;
		try {
			menu = getMenu(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("선택된 메뉴:" + menu);
	}
	
	public static String getMenu(int num) throws Exception {
		if (num ==1) {
			return"선택";
			
		}else if (num ==2) {
			return "종료";
		} else {
			throw new NonExistsMenuException();
		}
	}
}
