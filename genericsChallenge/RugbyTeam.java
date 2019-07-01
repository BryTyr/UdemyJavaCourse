package genericsChallenge;

public class RugbyTeam extends Team{
    private int Wins;

    RugbyTeam(String name,int Wins) {
        super(name);
        this.Wins=Wins;
    }

    @Override
    public int getPoints() {
        return Wins*5;
    }
}
