package mypkg.config;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTestMain {
	public static void main(String[] args) {
		//@configuration 어노테이션을 읽어들이여면, 
		//AnnotationConfigApplicationContext를 사용해야 합니다. 
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(MyJavaConfig.class);
		System.out.println(context.toString());
		System.out.println("======================");
		
		Member hong = (Member) context.getBean("myuser");
		System.out.println(hong.toString());
		System.out.println("======================");
		
		Member park = (Member) context.getBean("hee");
		System.out.println(park.toString());
		System.out.println("======================");
		
		Member choi = (Member) context.getBean("choi");
		System.out.println(choi.toString());
		System.out.println("======================");

		
		List<Member> lists = context.getBean("allList",List.class);
		for(Member mem : lists) {
			System.out.println(mem.toString());
			System.out.println();
		}
	}
}
