import java.util.ArrayList;

public class Participants implements Comparable<Participants>{


    private int totalScore;
    private String name;
    private ArrayList<Integer> distances;

    public Participants(String name){
        this.name = name;
        this.totalScore = 0;
        this.distances = new ArrayList<Integer>();

    }

    public void addTotalScore(int i){
        this.totalScore += i;
    }

    public void addJumpDistance(int i){
        this.distances.add(i);
    }

    public int getScore(){
        return this.totalScore;
    }

    public String getName(){
        return this.name;
    }

    public String getDistances(){
        String distances = "";
        for(int i=0;i<this.distances.size()-1;i++){
            distances += this.distances.get(i) + " m, ";
        }
        distances += this.distances.get(this.distances.size()-1) + " m";
        return distances;
    }

    @Override
    public int compareTo(Participants skiier){
        return skiier.totalScore - this.totalScore;
    }





}
