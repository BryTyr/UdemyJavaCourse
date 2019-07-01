package burgerChallenge;

public class DeluxeBurger extends Hamburger {

    DeluxeBurger(Bread BreadType, Meat meat, double price) {
        super(BreadType, meat, price);
        super.SetItemCount(0);
    }

    public void getCurrentIngredientsAndCosts(){
        super.getCurrentIngredientsAndCosts();
        System.out.println("also comes with a drink");
        System.out.println("Also comes with chips");

    }
}
