package mycomputer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//스프링을 이용한 DI실습
public class ComputerMain {
	public static void main(String[] args) {
		String configLocation = "mycomputer/computer.xml";
		// mycomputer 패키지 안에 computer.xml 이라는 파일이 존재해야 합니다.
		// 이 xml 파일을 스프링 설정 파일이라고 부르겠습니다.
		// 교안 95~97페이지
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
//		System.out.println(context.toString());
		
		Computer mycom = (Computer) context.getBean("computer");
		System.out.println(mycom.toString());
		System.out.println();
		Programmer soo = (Programmer) context.getBean("programmer");
		System.out.println(soo.toString());
	
	}

}
