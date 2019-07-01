package genericsChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {

    private ArrayList<T> Teams = new ArrayList<>();
    private String LeagueName;

    LeagueTable(String LeagueName) {
        this.LeagueName = LeagueName;
    }

    public ArrayList<T> getTeams() {
        return Teams;
    }

    public void setTeam(T team) {
        if(Teams.indexOf(team)!=-1){
            System.out.println("This team is already in the league");
        }else{
            Teams.add(team);
        }
    }

    public String getLeagueName() {
        return LeagueName;
    }

    public void getLeagueOrder() {
        if(Teams.size()==0){
            System.out.println("No teams entered in the league");
        }
        if(Teams.size()==1){
            System.out.println("Only one team in the league");
            System.out.println("1st team are: "+Teams.get(0).getName());
        }
        Collections.sort(Teams);

        for(int i=0;i<Teams.size();i++){
            System.out.println("The number "+(i+1)+" team in the "+this.LeagueName+" is "+Teams.get(i).getName());
        }
    }

}
