package shape.annotation;

import java.util.List;

// 다오 인터페이스와 연동을 하기위한 서비스 인터페이스
// 서비스 : 사각형, 삼각형, 원 등의 업무 모듈의 집합체
public interface Shape {
	public Object GetShapeOne();
	public List<Object> GetAllShape();
}
