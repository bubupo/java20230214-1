package ch06.sec10.exam02;

public class Television {
	static String cmpany = "MyCompany";
	static String model = "LCD";
	static String info;
	
	
	//static initialization block: 스태틱 필드 초기화 
	//정적 초기화 블럭
	static {
		info = cmpany + "-"+model;
	}
}
