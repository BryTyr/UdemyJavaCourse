package burgerChallenge;

public class Main {
    // The purpose of the application is to help a ficticious company called Bills Burgers to manage
    // their process of selling hamburgers.
    // Our application will help Bill to select types of burgers, some of the additional items (additions) to
    // be added to the burgers and pricing.
    // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
    // Bills store.
    // The basic hamburger should have the following items.
    // bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger.
    // Each one of these items gets charged an additional
    // price so you need some way to track how many items got added and to calculate the final price (base
    // burger with all the additions).
    // This burger has a base price and the additions are all seperately priced (up to 4 additions, see above).
    // Create a Hamburger class to deal with all the above.
    // The constructor should only include the roll type, meat and price, can also include name of burger or you can use setter.
    // Also create two extra varieties of Hamburgers (subclasses) to cater for
    // a) Healthy burger (on a brown rye bread roll), plus two addition items can be added.
    // The healthy burger can have 6 items (Additions) in total.
    // hint:  you probably want to process the 2 additional items in this new class (subclass of Hamburger), not the base class (Hamburger),
    // since the 2 additions are only appropriate for this new class (in other words new burger type).
    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.
    //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
    // burger (base price + all additions)
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals to final price.
    public static void main(String[] args) {
        Bread whiteBread = new Bread("white bread",2);
        Bread brownBread = new Bread("brown bread",2.5);

        Meat chicken = new Meat("chicken",2);
        Meat Beef = new Meat("beef",3);

        Ingredient tomato = new Ingredient("tomato",.5);
        Ingredient lettuce = new Ingredient("lettuce",.8);
        Ingredient bacon = new Ingredient("bacon",1.5);
        Ingredient dressing = new Ingredient("dressing",.4);


        Hamburger plainBurger = new Hamburger(whiteBread,Beef,Beef.getBaseIngredientPrice()+whiteBread.getBaseIngredientPrice());
        plainBurger.setIngredient(tomato);
        plainBurger.setIngredient(lettuce);
        plainBurger.setIngredient(bacon);
        plainBurger.setIngredient(dressing);

        plainBurger.getCurrentIngredientsAndCosts();

        DeluxeBurger deluxeBurger = new DeluxeBurger(whiteBread,chicken,chicken.getBaseIngredientPrice()+whiteBread.getBaseIngredientPrice());
        deluxeBurger.getCurrentIngredientsAndCosts();

        HealthyBurger healthyBurger = new HealthyBurger(brownBread,chicken,chicken.getBaseIngredientPrice()+brownBread.getBaseIngredientPrice());
        healthyBurger.setIngredient(tomato);
        healthyBurger.setIngredient(lettuce);
        healthyBurger.setIngredient(bacon);
        healthyBurger.setIngredient(dressing);
        healthyBurger.setIngredient(tomato);

        healthyBurger.getCurrentIngredientsAndCosts();




    }
}
