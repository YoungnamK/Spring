package mycomputer;

public class Computer {
	private String cpu;
	private String hdd;
	private String mainboard;
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}

	@Override
	public String toString() {
		return "Computer01 [cpu=" + cpu + ", hdd=" + hdd + ", mainboard=" + mainboard + "]";
	}

}
