package shape.annotation;


//원 1개를 의미하는 bean클래스
public class RectangleBean {
	private double width;
	private double height;
	
	public RectangleBean() {}
	
	public RectangleBean(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		String imsi="";
		imsi+= "밑변 : "+width+", ";
		imsi+= "높이 : "+height+"\n";
		imsi+= "면적 : "+(width*height)+"\n";
		return imsi;
	}
	
	
}
