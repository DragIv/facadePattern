package hometheater;

public class TheaterLights {

	public void on() {
		System.out.println("Theater lights on");
	}

	public void off() {
		System.out.println("Theater lights off");
	}

	public void dim(int level) {
		System.out.println("Theater lights dimming to " + level  + "%");
	}
}
