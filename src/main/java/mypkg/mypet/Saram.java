package mypkg.mypet;

public class Saram {
	private String name ;
	private Animal dog;
	private Animal cat;
	public Saram(Animal dog, String name, Animal cat) {
		this.dog= dog;
		this.name = name;
		this.cat=cat;
	}
	@Override
	public String toString() {
		String imsi="";
		imsi+= dog +"\n";
		imsi+= "저는 "+name +"입니다 \n";
		imsi+= cat;
		return imsi;
	}


}
