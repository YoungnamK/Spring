package play.instrument;

import java.util.Collection;

//이 클래스는 컬랙션 Set, List를 위한 클래스입니다. 
public class OneManBand implements Perfomer {
	private Collection<Instrument> abcd;

	//setter injection을 위한 메소드.
	public void setAaa(Collection<Instrument> instruments) {
		//매개 변수의 이름과 인스턴스 변수의 이름은 달라도 무관함
		 this.abcd = instruments;
	}

	@Override
	public void perform() {
		System.out.println("확장 for를 이용해 악기들을 연주합니다.");
		for (Instrument inst : abcd) {
			inst.play();
		}
	}
}
