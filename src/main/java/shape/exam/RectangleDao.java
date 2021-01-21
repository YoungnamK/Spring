package shape.exam;

import java.util.ArrayList;
import java.util.List;

public class RectangleDao implements ShapeDao{
	
	@Override
	public Object getShapeOne() {
		RectangleBean bean = new RectangleBean(4.0, 3.0);
		return bean;
	}
	@Override
	public List<Object> getAllShape() {
		List<Object> lists = new ArrayList<Object>();
		lists.add(new RectangleBean(4.0, 3.0));
		lists.add(new RectangleBean(6.0, 5.0));
		
		return lists;
	}
}
