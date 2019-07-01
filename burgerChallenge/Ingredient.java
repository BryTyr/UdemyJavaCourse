package burgerChallenge;

public class Ingredient {
    String ingredientName;
    double price;

    Ingredient(String ingredientName, double price){
        this.ingredientName=ingredientName;
        this.price=price;

    }

    public String getIngredientType(){
        return ingredientName;
    };
    public double getPrice(){
        return price;
    };
}
