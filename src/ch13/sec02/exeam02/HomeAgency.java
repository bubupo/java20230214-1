package ch13.sec02.exeam02;

public class HomeAgency implements Rentable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}
}
