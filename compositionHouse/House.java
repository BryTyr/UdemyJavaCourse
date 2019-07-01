package compositionHouse;

public class House {
    private Kitchen kitchen;

    public House(Kitchen kitchen){
        this.kitchen=kitchen;
    }

    public void isKitchenReadyForDinner(){
        kitchen.isKitchenReadyForDinner();
    }
    public Kitchen getKitchen(){
        return kitchen;
    }
}
