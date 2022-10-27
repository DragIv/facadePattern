import Settings.*;

public class Main {
    public static void main(String[] args) {
        amountOfGrass grass = new amountOfGrass();
        hairWorks hair = new hairWorks();
        hardwareCursor cursor = new hardwareCursor();
        reliefQuality reilef = new reliefQuality();
        screenMode screenmode = new screenMode();
        screenResolution screenresolution = new screenResolution();
        shadowQuality shadow = new shadowQuality();
        waterQuality water = new waterQuality();

        GraphicsFacade graphicsFacade = new GraphicsFacade(grass,hair,cursor,reilef,screenmode,screenresolution,shadow,water);

        graphicsFacade.LowGraphics();
        System.out.println();

        graphicsFacade.AvaregeGraphics();
        System.out.println();

        graphicsFacade.HightGraphics();
        System.out.println();

        graphicsFacade.BeyondGraphics();
        System.out.println();

        graphicsFacade.CustomGraphics();

    }
}
