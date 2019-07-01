package inheritanceChallengeP1;

public class Main {

    public static void main(String[] args) {
        // I learned here that a parent class should never need to know info about its child classes
        // I found this out by using Veichle F1 = new Ferrari(...)
        // I then tried to call the getModel method in ferrari and this down cast the object to a ferrari object
        // to use the method which is bad practice if I knoe im using a ferrari object it should be set as such

        Ferrari F1 = new Ferrari("long",7,300,"formula1");
        F1.ChangeSpeed(true,50);
        F1.changingGears(true);
        F1.changingGears(true);
        F1.getModel();
        F1.Steering("left");

    }
}
