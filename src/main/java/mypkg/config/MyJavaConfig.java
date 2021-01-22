package mypkg.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 이 클래스를 설정파일로 사용한다 . (xml대신)
public class MyJavaConfig {
	@Bean // 이름이 myuser (메소드의 이름이 빈의 이름이 됨)
	public Member myuser() {
		return new Member("hong", "홍길동",30);
	}
	@Bean
	public Member hee() {
		return new Member("park","박영희",20);
	}
	
	
	@Bean(name = "choi")
	public Member youruser() {
		return new Member("choi","최영",25);
	}
	
	@Bean
	public List<Member> allList(){
		List<Member> lists = new ArrayList<Member>();
		lists.add(myuser());
		lists.add(hee());
		lists.add(youruser());
		
		return lists;
		
	}
	
}
