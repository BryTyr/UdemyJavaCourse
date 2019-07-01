package compositionHouse;

public class Cooker {
    boolean cookerPower;

    Cooker(){
        cookerPower=false;
    }

    public boolean isOn() {
        return getCookerSetting();
    }
    public void turnCookerOn(){
        cookerPower=true;
        System.out.println("cooker turned on");
    }
    public boolean getCookerSetting() {
        return cookerPower;
    }
}
