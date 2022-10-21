package hometheater;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {

		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		StreamingPlayer player = new StreamingPlayer();
		CdPlayer cd = new CdPlayer(amp);
		Projector projector = new Projector(player);
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
 
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		System.out.println();

		homeTheater.endMovie();
		System.out.println();

		homeTheater.listenToRadio(2);
		System.out.println();
		homeTheater.endRadio();

		homeTheater.projector.off();
	}
}
