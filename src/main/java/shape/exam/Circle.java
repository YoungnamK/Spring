package shape.exam;

import java.util.List;

public class Circle implements Shape {
	
	private ShapeDao shapeDao;
	
	
	
	public void setShapeDao(ShapeDao shapeDao) {
		this.shapeDao = shapeDao;
	}

	@Override
	public Object getShapeOne() {
		return this.shapeDao.getShapeOne();
	}

	@Override
	public List<Object> getAllShape() {
		return this.shapeDao.getAllShape();
	}

}
