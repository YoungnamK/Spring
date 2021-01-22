package shape.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component("myCircleDao")
// 자바의 CircleDao myCircleDao = new CircleDao(); 와 같음
public class CircleDao implements ShapeDao{

	@Override
	public Object GetShapeOne() {
		// 하나의 원 정보를 반환
		return new CircleBean(3.0, 4.0, 5.0);
	}

	@Override
	public List<Object> GetAllShape() {
		// 여러개의 원을 목록으로 반환
		List<Object> lists = new ArrayList<Object>();
		lists.add(new CircleBean(3.0, 4.0, 5.0));
		lists.add(new CircleBean(5.0, 6.0, 7.0));
		lists.add(new CircleBean(2.0, 3.0, 4.0));
		return lists;
	}

	
}
