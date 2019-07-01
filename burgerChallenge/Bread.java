package burgerChallenge;

public class  Bread implements BaseIngredient {
    private String BaseIngreadiant;
    private double BaseIngreadiantprice;

    Bread(String BaseIngreadiant,double BaseIngreadiantprice){
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
