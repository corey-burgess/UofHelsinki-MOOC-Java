public class Player {

    private String player;
    private int goals;

    public Player (String name, int goals) {
        this.player = name;
        this.goals = goals;
    }

    public Player (String name) {
        this(name, 0);
    }

    public String getName(){
        return this.player;
    }

    public int goals(){
        return this.goals;
    }

    public String toString(){
        return this.player + ", goals " + this.goals;
    }
}
