package rectangle.exam;

public class Ladder implements Rectangle {
	
	private int base_lower;
	private int base_upper;
	private int height;

	
	
	public Ladder(int base_lower, int base_upper, int height) {
		this.base_lower = base_lower;
		this.base_upper = base_upper;
		this.height = height;
	}
	@Override
	public void Print() {
		int result = (this.base_lower+this.base_upper)/2*this.height;
		System.out.println("사다리꼴의 넓이 : "+result);
	}
	@Override
	public void Diagonal() {
	}
}
