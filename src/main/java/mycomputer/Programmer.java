package mycomputer;

public class Programmer {
	private String name;
	private String address;
	//프로그래머가 컴퓨터에 의존한다.
	private Computer computer;
	public Programmer(String name, String address, Computer computer ) {//생성자
		this.name=name;
		this.address=address;
		this.computer=computer;
		
	}
	@Override
	public String toString() {
		return "Programmer01 [name=" + name + ", address=" + address + ", computer=" + computer + "]";
	}

}
