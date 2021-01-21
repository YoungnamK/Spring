package shape.exam;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
	public static void main(String[] args) {
		String xml ="shape/exam/applicationContext.xml";
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(xml);
		System.out.println(context);
		Circle circle = (Circle) context.getBean(Circle.class);
		Object mycircle = circle.getShapeOne();
		System.out.println(mycircle.toString());
		System.out.println("===도형 리스트===");
		List<Object> cir = circle.getAllShape();
		for(Object mycir : cir) {
			System.out.println(mycir.toString());
			System.out.println();
		}
		System.out.println();
		Rectangle rect = (Rectangle) context.getBean(Rectangle.class);
		Object myrect = rect.getShapeOne();
		System.out.println(myrect.toString());
		System.out.println("===사각형 목록 보기===");
		List<Object> lists = rect.getAllShape();
		for(Object list : lists) {
			System.out.println(list.toString());
			System.out.println();
		}
	
	
	
	}
	
	
}
