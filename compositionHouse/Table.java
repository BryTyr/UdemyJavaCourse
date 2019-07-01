package compositionHouse;

public class Table {
    private boolean tableCloth;

    Table(){
        tableCloth=false;
    }
    public boolean isTableClothSet() {
        return getTableCloth();
    }

    public void setTableCloth() {
        tableCloth=true;
        System.out.println("table cloth is set for dinner");
    }
    public boolean getTableCloth() {
        return tableCloth;
    }
}
