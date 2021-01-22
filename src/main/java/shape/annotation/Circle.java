package shape.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//클래스 객체 = new 생성자();
//@Component  // Circle circle = new Circle();
//component 어노테이션은 클래스 이름을 지정하지 않으면 클래스 이름을 소문자로 지정해 객체를 생성합니다. 
@Component("myCircle") //Circle myCircle = new Circle();
public class Circle implements Shape {
	
	//required = true 는 반드시 주입해야 한다는 뜻
	@Autowired(required = true)	// 이 변수는 자동으로 주입을 하도록 하겠습니다.
	@Qualifier("myCircleDao") //ShapeDao 타입 중 이름이 "myCircleDao"인 항목을 찾음
	private ShapeDao shapeDao;	// 약한 결합을 위해 CircleDao가 아닌 ShapeDao
	//shapeDao는 외부에서 주입되어야 합니다.

	@Override
	public Object GetShapeOne() {
		return this.shapeDao.GetShapeOne();
	}

	@Override
	public List<Object> GetAllShape() {
		return this.shapeDao.GetAllShape();
	}

}
