package shape.annotation;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
	public static void main(String[] args) {
		String configLocation ="shape/annotation/applicationContext.xml";
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(configLocation);
		
		Shape shape1 = context.getBean("myCircle", Shape.class);
		// Shape 형태의 객체 중 객체 이름이 "myCircle" 인 항목을 찾아주세요.
		Object data1 = shape1.GetShapeOne();
		System.out.println("원의 정보 : ");
		System.out.println(data1.toString());
		List<Object> lists1 = shape1.GetAllShape();
		System.out.println("원의 목록 보기");
		for (Object obj : lists1) {
			System.out.println(obj.toString());
			System.out.println();
		}
		System.out.println("----------------------------------");
		Shape shape2 = context.getBean("myRectangle", Shape.class);
		// Shape 형태의 객체 중 객체 이름이 "myRectangle" 인 항목을 찾아주세요.
		Object data2 = shape2.GetShapeOne();
		System.out.println("사각형의 정보 : ");
		System.out.println(data2.toString());
		List<Object> lists2 = shape2.GetAllShape();
		System.out.println("사각형의 목록 보기");
		for (Object obj : lists2) {
			System.out.println(obj.toString());
			System.out.println();
		}
	}
}
