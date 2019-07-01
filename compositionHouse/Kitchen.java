package compositionHouse;

public class Kitchen {
    private Table table;
    private Cooker cooker;
    private boolean KitchenReady;


    Kitchen(Table table,Cooker cooker){
        this.table=table;
        this.cooker=cooker;
        KitchenReady=false;
    }

    public boolean isKitchenReadyForDinner() {
        if(!table.isTableClothSet()){
            table.setTableCloth();
        }else{
            System.out.println("Tablecloth set for dinner");
        }
        if(!cooker.isOn()){
            cooker.turnCookerOn();
        }else{
            System.out.println("cooker is on");
        }
        if(cooker.isOn()&&table.isTableClothSet()){
            System.out.println("SUCCESS: Kitchen ready for dinner ");
            KitchenReady=true;
            return KitchenReady;
        }else{
            System.out.println("ERROR: Kitchen not ready ");
            KitchenReady=false;
            return KitchenReady;
        }
    }
    public Cooker getCooker(){
        return cooker;
    }
}
