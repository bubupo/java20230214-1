package ch05.sec12;

import java.util.*;

public class WeekExample {
	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1: today = Week.SUNDAY;  break;
		case 2: today = Week.MONDAY;  break;
		case 3: today = Week.TUESDAY;  break;
		case 4: today = Week.WEDNESDY;  break;
		case 5: today = Week.THURSDAY;  break;
		case 6: today = Week.FRIDAY;  break;
		case 7: today = Week.SATURDAY;  break;
		
	
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 내일 출근 합니다.");
		}else if(today == Week.MONDAY){
			System.out.println("오늘은 월요일 입니다.");
		}else if(today == Week.MONDAY){
			System.out.println("오늘은 월요일 입니다.");
		}else if(today == Week.MONDAY){
			System.out.println("오늘은 월요일 입니다.");
		}else if(today == Week.MONDAY){
			System.out.println("오늘은 월요일 입니다.");
		}else if(today == Week.MONDAY){
			System.out.println("오늘은 월요일 입니다.");
		}else if(today == Week.MONDAY){
			System.out.println("오늘은 월요일 입니다.");
		}
	}
}
