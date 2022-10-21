package hometheater;

public class Amplifier {
	Tuner tuner;
	StreamingPlayer player;
	


	public void on() {
		System.out.println("Amplifier on");
	}
 
	public void off() {
		System.out.println("Amplifier off");
	}

	public void setSurroundSound() {
		System.out.println("surround sound on (5 speakers, 1 subwoofer)");
	}
 
	public void setVolume(int level) {
		System.out.println("setting volume to " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println("setting tuner to " + tuner);
		this.tuner = tuner;
	}
  
	public void setStreamingPlayer(StreamingPlayer player) {
		System.out.println("setting Streaming player to " + player);
		this.player = player;
	}
}
