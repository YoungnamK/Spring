package mycomputer;

public class MainProgram {

	public static void main(String[] args) {
		Computer computer = new Computer();

		//세터를 이용해 데이터를 주입 (setter injection)
		computer.setCpu("인텔 CPU");
		computer.setHdd("삼성 HDD");
		computer.setMainboard("엘지 메인보드");
		
		Programmer soo = new Programmer("김철수", "용산구 도원동", computer);
		System.out.println(soo.toString());
	}

}
