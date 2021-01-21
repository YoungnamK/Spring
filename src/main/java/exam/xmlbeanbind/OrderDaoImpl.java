package exam.xmlbeanbind;

public class OrderDaoImpl implements OrderDao {
	@Override
	public void insertOrder() {
		System.out.println("주문정보 추가 : insertOrder()메소드 실행");
	}

	@Override
	public void removeOrder() {
		System.out.println("주문정보 삭제 : removeOrder()메소드 실행");
	}
}
