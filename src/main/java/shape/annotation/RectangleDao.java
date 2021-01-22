package shape.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("myRectangleDao")
//자바의 RectangleDao myRectangleDao = new RectangleDao(); 와 같음
public class RectangleDao implements ShapeDao{

	@Override
	public Object GetShapeOne() {
		// 하나의 사각형 정보를 반환
		return new RectangleBean(10.0, 20.0);
	}

	@Override
	public List<Object> GetAllShape() {
		// 여러개의 사각형을 목록으로 반환
		List<Object> lists = new ArrayList<Object>();
		lists.add(new RectangleBean(10.0, 20.0));
		lists.add(new RectangleBean(10.0, 10.0));
		return lists;
	}

	
}
