package coupling;

public class Human {
	private Sport sport;
	
	public Human(Sport sport) {
		this.sport = sport;
	
	}
	public void play() {
		this.sport.play();
	}
	public void stop() {
		this.sport.stop();
	}
}
