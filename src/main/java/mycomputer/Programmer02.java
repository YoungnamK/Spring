package mycomputer;

public class Programmer02 {
	private String name;
	private String address;
	//프로그래머가 컴퓨터에 의존한다.
	private Computer02 computer=null;
	public Programmer02(String name, String address) {//생성자
		this.name=name;
		this.address=address;
		this.computer=new Computer02();
		//setter를 이용해 데이터를 씁니다 (setter injection)
		computer.setCpu("인텔 씨피유");
		computer.setHdd("삼성 hdd");
		computer.setMainboard("엘지 메인보드");
		
	}
	@Override
	public String toString() {
		return "Programmer02 [name=" + name + ", address=" + address + ", computer=" + computer + "]";
	}

}
