package inheritanceChallengeP1;

public class Car extends Vehicle {

    private int NumOfGears;
    private int currentGear;
    private int currentSpeed;
    private int topSpeed;

    Car(String size, int NumOfGears,int topSpeed){
        super(size);
        this.NumOfGears=NumOfGears;
        this.topSpeed=topSpeed;
        currentGear=1;
        currentSpeed=0;
    }


    public void changingGears(boolean ChangeUpGear){
        if(ChangeUpGear){
            if(NumOfGears!=currentGear){
                currentGear+=1;
                System.out.println("Current Gear "+currentGear);
            }else{
                System.out.println("In Top Gear ");
            }
        }
        else{
            if(NumOfGears!=1){
                currentGear-=1;
                System.out.println("Current Gear "+currentGear);
            }else{
                System.out.println("In First Gear ");
            }

        }
    }

    public void Steering(String Direction){
        if(Direction.contains("left")){
            System.out.println("Turn Left");
        }
        else if(Direction.contains("left")){
            System.out.println("Turn Right");
        }
        else{System.out.println("invalid direction");}
    }
    public void ChangeSpeed(boolean speedUp, int amount){
        if(speedUp){
            if(topSpeed>=amount+currentSpeed){
                currentSpeed+=amount;
                System.out.println("Current Speed "+currentSpeed);
            }
            else{
                System.out.println("Above top speed ");
            }
        }else{
            if(0>currentSpeed-amount){
                currentSpeed-=amount;
                System.out.println("Current Speed "+currentSpeed);
            }
            else{
                System.out.println("Cannot have minus speed ");
            }
        }
    }
}
