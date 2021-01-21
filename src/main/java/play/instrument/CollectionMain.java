package play.instrument;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class CollectionMain {

	public static void main(String[] args) {
		String xml = "play/instrument/collection.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xml);
		System.out.println(context);
		System.out.println("List컬랙션 와이어링 예시입니다. ");
		
		Perfomer gunmo = (Perfomer) context.getBean("gunmo");
		gunmo.perform();
		System.out.println("-----------------------");
		
		
		Perfomer jinsub = (Perfomer) context.getBean("jinsub");
		jinsub.perform();
		System.out.println("-----------------------");
		
		
		Perfomer hun = (Perfomer) context.getBean("hun");
		hun.perform();
		System.out.println("-----------------------");
		
		
		Perfomer yoon = (Perfomer) context.getBean("yoon");
		yoon.perform();
	}

}
