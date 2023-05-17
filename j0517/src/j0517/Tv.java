package j0517;

public class Tv {
	String color;
	boolean power;
	int channel;
	int volume;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		if(channel>=999) {
			channel=1;
			return;
		}
		channel++;
	}
	void channelDown() {
		if(channel<=1) {
			channel=999;
			return;
		}
		channel--;
	}
	void volumeUp() {
		if(volume>=100) {
			volume=100;
			return;
		}
		volume++;
	}
	void volumeDown() {
		if(volume<=0) {
			volume=0;
			System.out.println("볼륨은 0이하로는 내려가지 않습니다.");
			return;
		}
		volume--;
	}
}