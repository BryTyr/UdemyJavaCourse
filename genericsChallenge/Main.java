package genericsChallenge;

public class Main {
    // ArrayList<Team> teams;
    // Collections.sort(teams);
    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.
    public static void main(String[] args) {

        LeagueTable<FootballTeam> PremierLeague = new LeagueTable<>("Premier League");

        FootballTeam Liverpool = new FootballTeam("Liverpool",20,5);
        FootballTeam ManUnited = new FootballTeam("ManUnited",5,20);
        FootballTeam ManCity = new FootballTeam("ManCity",1,24);

        RugbyTeam Leinster = new RugbyTeam("Leinster",30);

        PremierLeague.setTeam(ManUnited);
        PremierLeague.setTeam(ManCity);
        PremierLeague.setTeam(Liverpool);

        //This line throws a compile time error as this is not allowed due to generics
        //PremierLeague.setTeam(Leinster);

        PremierLeague.getLeagueOrder();



    }
}
