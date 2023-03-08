package ch08.sce05;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV 를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV 를 끕니다.");

	}

	@Override
	public void setVolume(int Volume) {
		System.out.println("현재 tv볼륨:"+Volume);

	}

}
