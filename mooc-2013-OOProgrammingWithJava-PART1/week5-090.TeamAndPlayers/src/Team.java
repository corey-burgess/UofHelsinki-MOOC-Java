import java.util.ArrayList;

public class Team {

    private String name;
    private int teamSize = 16;
    private ArrayList<Player> team = new ArrayList<Player>();

    public Team (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (team.size() >= teamSize) {
            return;
        }
        this.team.add(player);
    }

    public void printPlayers() {
        for (Player player : team) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.teamSize = maxSize;
    }

    public int size() {
        return this.team.size();
    }

    public int goals() {
        int i = 0;
        for (Player player : team) {
            i += player.goals();
        }
        return i;
    }

}
