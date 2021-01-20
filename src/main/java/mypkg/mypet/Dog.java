package mypkg.mypet;

public class Dog extends Animal{
	private String name;
	private String type;
	private String sound;
	public Dog(String name, String type, String sound) {
		this.name = name;
		this.type = type;
		this.sound = sound;
	}
	@Override
	public String toString() {
		String imsi ="우리집 " + name +"는 " + type +"이고 " + sound +"짖습니다.";
		return imsi;
	}
}
