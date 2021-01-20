package shape.circle;

public class Point {//점 클래스
	private double xpos; // x좌표
	private double ypos; // y좌표
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}
	@Override
	public String toString() {
		String imsi ="x 좌표 : "+this.xpos+", ";
		imsi+="y 좌표 : "+this.ypos+"\n";
		return imsi;
	}
	
	
}
