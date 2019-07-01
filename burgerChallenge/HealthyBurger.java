package burgerChallenge;

public class HealthyBurger extends Hamburger {

    HealthyBurger(Bread BreadType, Meat meat, double price) {
        super(BreadType, meat, price);
        super.SetItemCount(6);
    }
}
