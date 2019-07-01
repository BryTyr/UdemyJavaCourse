package carPolymorphism;




class Car {

    private int numberOfCylinders;
    private String name;
    private int wheels;
    private boolean engine;

    Car(String name, int cylinders) {
        wheels = 4;
        engine = true;
        this.name = name;
        numberOfCylinders = cylinders;
    }

    public void StartEngine() {
        System.out.println("engine of car started");
    }

    public void applyBrakes() {
        System.out.println("Brakes applied to car");
    }
}


class Ferrari extends Car {

    Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }
    public void StartEngine() {
        System.out.println("engine of ferrari started");
    }

    public void applyBrakes() {
        System.out.println("Brakes applied to ferrari");
    }
}

class Jaguar extends Car {

    Jaguar(String name, int cylinders) {
        super(name, cylinders);
    }
    public void StartEngine() {
        System.out.println("engine of Jaguar started");
    }

    public void applyBrakes() {
        System.out.println("Brakes applied to Jaguar");
    }
}
class Porsche extends Car {

    Porsche(String name, int cylinders) {
        super(name, cylinders);
    }
    public void StartEngine() {
        System.out.println("engine of porsche started");
    }

    public void applyBrakes() {
        System.out.println("Brakes applied to porsche");
    }
}
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            Car car = RandomCar();
            car.StartEngine();
            car.applyBrakes();

        }
    }

    public static Car RandomCar() {
        int RandomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random car choice was: " + RandomNumber);
        switch (RandomNumber) {
            case 1:
                return new Ferrari("red one", 6);
            case 2:
                return new Jaguar("blue one", 8);
            case 3:
                return new Porsche("Yellow one", 4);
        }
        return null;
    }
}
