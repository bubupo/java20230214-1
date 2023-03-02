package ch06.sec07.exam05;

public class Car {
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car (String model){
		this(model, "은색", 500);
	}
	Car (String model, String color){
		this(model, color, 500);
	}
	
	Car (String model ,String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	
	}
	
}
