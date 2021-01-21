package shape.exam;

import java.util.List;

public class Rectangle implements Shape {
	private ShapeDao shapeDao;
	
	
	public void setShapeDao(ShapeDao shapeDao) {
		this.shapeDao = shapeDao;
	}
	@Override
	public Object getShapeOne() {
		return shapeDao.getShapeOne();
	}
	@Override
	public List<Object> getAllShape() {
		return shapeDao.getAllShape();
	}
}
