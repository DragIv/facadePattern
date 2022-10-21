package hometheater;

public class CdPlayer {
	int currentTrack;
	Amplifier amplifier;
	String title;
	
	public CdPlayer(Amplifier amplifier) {
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println("CdPlayer on");
	}
 
	public void off() {
		System.out.println("CdPlayer off");
	}

	public void play(int track) {
		if (title == null) {
			System.out.println("CdPlayer can't play track " + currentTrack + ", no cd inserted");
		} else {
			currentTrack = track;
			System.out.println("CdPlayer playing track " + currentTrack);
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.println("CdPlayer stopped");
	}
 
	public void pause() {
		System.out.println("CdPlayer paused \"" + title + "\"");
	}
}
