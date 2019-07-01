package interfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {


    private String Name;
    private String Age;

    public Player() {
    }

    @Override
    public List<String> writeData() {
        List<String> PlayerData = new ArrayList<>();
        PlayerData.add(Name);
        PlayerData.add(Age);

        return PlayerData;
    }

    @Override
    public void readData(List<String> data) {
        this.Name=data.get(0);
        this.Age=data.get(1);
    }

    @Override
    public String toString(){
        return "player Name: "+Name+" /n player age: "+Age;
    }
}
