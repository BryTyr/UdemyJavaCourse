package interfaceChallenge;


import java.util.List;

public interface ISaveable {

    List<String> writeData();

    void readData(List<String> data);
}
