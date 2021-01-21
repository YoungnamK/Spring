package shape.exam;

import java.util.ArrayList;
import java.util.List;

public class CircleDao implements ShapeDao{
	

	@Override
	public Object getShapeOne() {
		CircleBean bean = new CircleBean(3.0, 4.0, 5.0);
		return bean;
	}
	
	@Override
	public List<Object> getAllShape() {
		List<Object> circles = new ArrayList<Object>();
		circles.add(new CircleBean(3.0, 4.0, 5.0));
		circles.add(new CircleBean(5.0, 6.0, 7.0));
		circles.add(new CircleBean(2.0, 3.0, 4.0));

		return circles;
	}
}
