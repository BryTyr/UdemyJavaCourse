package genericsChallenge;

public abstract class Team<T> implements Comparable<Team>{

    private String Name;
    private int Points;

    Team(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }


    @Override
    public int compareTo(Team team){
        if(this.Points>team.getPoints()){
                return 1;
        }else if(this.Points<team.getPoints()){
            return -1;
        }
        return 0;
    }

    public abstract int getPoints();
}
