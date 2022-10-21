package hometheater;

public class Projector {
	StreamingPlayer player;
	
	public Projector(StreamingPlayer player) {
		this.player = player;
	}
 
	public void on() {
		System.out.println("Projector on");
	}
 
	public void off() {
		System.out.println("Projector off");
	}

	public void wideScreenMode() {
		System.out.println("Projector in widescreen mode");
	}

	public void tvMode() {
		System.out.println("Projector in tv mode");
	}
}
