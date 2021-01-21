package shape.xmlconfig;

import java.util.List;

// 도형과 관련해 데이터베이스와 연동할 다오 인터페이스
public interface ShapeDao {
	public Object GetShapeOne();	// 도형 1개의 정보 (상세보기)
	public List<Object>GetAllShapes(); 
}
