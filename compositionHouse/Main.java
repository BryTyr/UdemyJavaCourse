package compositionHouse;

public class Main {

    public static void main(String[] args) {
        Table table = new Table();
        Cooker cooker = new Cooker();
        Kitchen kitchen = new Kitchen(table,cooker);
        House house = new House(kitchen);

        // data hidden this way  only need to call the desired method to preform the action
        house.isKitchenReadyForDinner();

        // can turn cooker on by using a getter methods accessed through the kitchen then cooker objects like so
        // the first way is preferable as it perfroms encapsulation on the data
        house.getKitchen().getCooker().turnCookerOn();


    }
}
