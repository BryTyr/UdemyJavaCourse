package genericsChallenge;

public class FootballTeam extends Team {
    private int Wins;
    private int Draws;

    FootballTeam(String name,int Wins,int Draws) {
        super(name);
        this.Wins=Wins;
        this.Draws=Draws;

    }

    @Override
    public int getPoints() {
        return Wins*3+Draws;
    }
}
