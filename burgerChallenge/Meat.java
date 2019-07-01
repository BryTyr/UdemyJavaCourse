package burgerChallenge;

public class Meat implements BaseIngredient {
    private String BaseIngreadiant;
    private double BaseIngreadiantprice;

    Meat(String BaseIngreadiant,double BaseIngreadiantprice){
        this.BaseIngreadiant=BaseIngreadiant;
        this.BaseIngreadiantprice=BaseIngreadiantprice;

    }

    @Override
    public double getBaseIngredientPrice() {
        return BaseIngreadiantprice;
    }

    @Override
    public String getBaseIngredienttype() {
        return BaseIngreadiant;
    }
}
