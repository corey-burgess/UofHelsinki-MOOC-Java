import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Jump {

    private Random randomNum;
    private Random randomScores;
    private int length;
    private List<Integer> scores;

    public Jump(){
        this.randomNum = new Random();
        this.randomScores = new Random();
    }

    public void jumpRound(){
        this.length = randomNum.nextInt(61) + 60;
        this.scores = new ArrayList<Integer>();
        int i = 0;
        while (i<5){
            int j = randomScores.nextInt(11) + 10;
            scores.add(j);
            i++;
        }
    }

    public void addLength(Participants skiier){
        skiier.addJumpDistance(this.length);
    }

    public int getLength(){
        return this.length;
    }

    public List<Integer> getScores(){
        return this.scores;
    }

    public void addScore(Participants skiier){
        Collections.sort(scores);
        int i = scores.get(1) + scores.get(2) + scores.get(3) + this.length;
        skiier.addTotalScore(i);
    }




}
