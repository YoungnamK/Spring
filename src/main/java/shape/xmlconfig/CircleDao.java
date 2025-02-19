package shape.xmlconfig;

import java.util.ArrayList;
import java.util.List;

//원과 관련해 실제로 데이터 베이스를 연동해주는 구현 클래스
public class CircleDao implements ShapeDao {

	@Override
	public Object GetShapeOne() {
		//원 객체 1개를 생성하여 반환해줍니다.
		//(원칙은 데이터베이스에서 1건을 읽어오는 것임)
		CircleBean bean = new CircleBean(3.0, 4.0, 5.0);
		return bean;
	}

	@Override
	public List<Object> GetAllShapes() {
		//(원칙은 데이터베이스에서 읽어와야 합니다.)
		//원 데이터를 컬렉션 형태로 반환해줍니다. 
		List<Object>lists = new ArrayList<Object>();
		lists.add(new CircleBean(3.0, 4.0, 5.0));
		lists.add(new CircleBean(6.0, 5.0, 3.0));
		lists.add(new CircleBean(8.0, 6.0, 4.0));
		lists.add(new CircleBean(4.0, 7.0, 9.0));

		return lists;
	}
}
