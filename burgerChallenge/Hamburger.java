package burgerChallenge;

public class Hamburger {
    private double price;
    private Bread BreadType;
    private Meat meat;
    private int currentCount;
    private int itemCount=3;
    private Ingredient[] ingredientList;

    Hamburger(Bread BreadType,Meat meat,double price){
        this.BreadType=BreadType;
        this.meat=meat;
        this.price=price;
        currentCount=0;
        ingredientList =new Ingredient[4];
    }

    public void SetItemCount(int value){
        ingredientList =new Ingredient[value];
        itemCount=value;
    }

    public void setIngredient(Ingredient ingredient){
        if(currentCount<=itemCount){
            ingredientList[currentCount]= ingredient;
            currentCount++;
            AddToPrice(ingredient.getPrice());
        }else{System.out.println("item limit reached");}
    }

    private void AddToPrice(double IngrediantPrice) {
        price+=IngrediantPrice;
    }
    public double getCurrentPrice(){
        return price;
    }
    public void getCurrentIngredientsAndCosts(){
        System.out.println("Item type is: "+BreadType.getBaseIngredienttype()+" And costs "+BreadType.getBaseIngredientPrice());
        System.out.println("meat type is: "+meat.getBaseIngredienttype()+" And costs "+meat.getBaseIngredientPrice());
        for(Ingredient ingreadiant: ingredientList){
            if(ingreadiant!=null)
            System.out.println("Ingredient type is: "+ingreadiant.getIngredientType()+" And costs "+ingreadiant.getPrice());
        }
        System.out.println("total cost of this burger is: "+getCurrentPrice());
    }

}
