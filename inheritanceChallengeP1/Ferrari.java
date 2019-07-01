package inheritanceChallengeP1;

public class Ferrari extends Car {
    private final String Model;

    Ferrari(String Size,int NumOfGears, int topSpeed, String Model) {
        super(Size, NumOfGears, topSpeed);
        this.Model=Model;
    }

    public void getModel(){
        System.out.println(Model);
    }
}
