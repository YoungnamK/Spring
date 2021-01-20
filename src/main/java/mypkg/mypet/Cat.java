package mypkg.mypet;

public class Cat extends Animal {
	private String type;
	private String name;
	private int age;
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		String imsi ="우리집 " + type +"의 이름은 "+name+"이고 " +age +"살 입니다.";
		return imsi;
	}
	
	
}
