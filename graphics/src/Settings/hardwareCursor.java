package Settings;

public class hardwareCursor {

    public void onoff(String onoff){

        if (onoff.equals("on")){
            System.out.println("Hardware cursor on");
        }
        else {
            System.out.println("Hardware cursor off");
        }
    }
}
