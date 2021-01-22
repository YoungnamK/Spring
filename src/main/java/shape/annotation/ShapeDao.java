package shape.annotation;

import java.util.List;

//db와 연동하기 위한 다오 인터페이스
public interface ShapeDao {
	//수행하려는 업무 스펙을 명시함

	public Object GetShapeOne();
	public List<Object> GetAllShape();

}
