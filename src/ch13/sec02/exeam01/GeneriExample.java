package ch13.sec02.exeam01;

import ch08.exeample05.*;

public class GeneriExample {
	public static void main(String[] args) {
		Product <Tv,String> product1 = new Product<>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String>product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
	}
}