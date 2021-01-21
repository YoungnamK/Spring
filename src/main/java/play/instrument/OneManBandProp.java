package play.instrument;

import java.util.Enumeration;
import java.util.Properties;


//이 클래스는 컬랙션 Properties를 위한 클래스 입니다. 
public class OneManBandProp implements Perfomer{
	private Properties abcd;
	public void setBbb(Properties inst) {
		this.abcd = inst;
	}
	@Override
	public void perform() {
		System.out.println("Enumeraion 인터페이스를 사용해 반복 출력합니다. ");
		Enumeration<Object> enu = this.abcd.keys();
		while (enu.hasMoreElements()) {
			Object key = (Object) enu.nextElement();
			String value = abcd.getProperty((String)key);
			System.out.println(key+"/"+value);
			
		}
	}
	
}
