package shape.xmlconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.css.Rect;

public class ShapeMain {
	public static void main(String[] args) {
		String configLocation = "shape/xmlconfig/applicationContext.xml";
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(configLocation);
		System.out.println(context);
		
//		Circle circle1 = (Circle)context.getBean("circle");
//		System.out.println(circle1);
//		System.out.println();
		Circle circle2 = (Circle)context.getBean(Circle.class);
//		System.out.println(circle2);
		Object mycircle = circle2.GetShapeOne();
		System.out.println(mycircle.toString());
		System.out.println("-------------");
		List<Object> mycirclelist = circle2.GetAllShapes();
		System.out.println("도형 리스트");
		for(Object circle : mycirclelist) {
			System.out.println(circle.toString());
		}
		System.out.println("-------------");
		System.out.println("사각형의 정보: ");
		Rectangle rect = (Rectangle) context.getBean(Rectangle.class);
		Object rect1 = rect.GetShapeOne();
		System.out.println(rect1.toString());
		System.out.println();
		System.out.println("===사각형 목록보기===");
		List<Object> rectlist = rect.GetAllShapes();
		for(Object rect2 : rectlist) {
			System.out.println(rect2.toString());
			System.out.println();
		}
		
	}

}
