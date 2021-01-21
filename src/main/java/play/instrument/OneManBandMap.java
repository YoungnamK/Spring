package play.instrument;

import java.util.Map;

//이 클래스는 컬랙션 Map를 위한 클래스입니다. 
public class OneManBandMap implements Perfomer {
	private Map<String, Instrument> abcd;

	//setter injection을 위한 메소드.
	public void setCcc(Map<String, Instrument> instruments) {
		//매개 변수의 이름과 인스턴스 변수의 이름은 달라도 무관함
		 this.abcd = instruments;
	}

	@Override
	public void perform() {
		System.out.println("map 구조를 반복해 악기들을 연주합니다.");
		for (String key : abcd.keySet()) {
			Instrument inst = abcd.get(key);
			System.out.print(key + " : ");
			inst.play();
		}
	}
}
