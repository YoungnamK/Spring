package exam.xmlbeanbind;
//배송과 관련되어 실제 구현할 클래스
public class DeliveryDaoImpl implements DeliveryDao {

	@Override
	public void insertAddress() {
		System.out.println("배송지 정보추가 : insertAddress() 메소드 실행");
	}

	@Override
	public void removeAddress() {
		System.out.println("배송지 정보삭제 : removeAddress() 메소드 실행");
	}
	
}
