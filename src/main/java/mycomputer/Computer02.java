package mycomputer;

public class Computer02 {
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
		return "Computer02 [cpu=" + cpu + ", hdd=" + hdd + ", mainboard=" + mainboard + "]";
	}

}
