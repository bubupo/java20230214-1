package ch08.sce05;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
			
			setVolume(MIN_VOLUME);
		}else{
			System.out.println("무음해제");
		}
	}
}
