package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }

    public void add(double situation){
        this.history.add(situation);
    }

    public void reset(){
        this.history.clear();
    }

    public String toString(){
        return this.history.toString();
    }

    public double maxValue(){
        if(this.history.size() == 0){
            return 0;
        }
        double greatest = this.history.get(0);
        for(int i = 1; i<this.history.size();i++){
            if(this.history.get(i) > greatest){
                greatest = this.history.get(i);
            }
        }
        return greatest;
    }

    public double minValue(){
        if(this.history.size() == 0){
            return 0;
        }
        double smallest = this.history.get(0);
        for(int i = 1; i<this.history.size();i++){
            if(this.history.get(i) < smallest){
                smallest = this.history.get(i);
            }
        }
        return smallest;
    }

    public double average(){
        if(this.history.size() == 0){
            return 0;
        }
        double sum = 0;
        for(Double num : this.history){
            sum += num;
        }
        return sum/this.history.size();
    }

    public double greatestFluctuation(){
        if(this.history.size() < 2){
            return 0;
        }
        double fluctuation = 0;
        for(int i = 1; i < this.history.size(); i++){
            double change = this.history.get(i-1) - this.history.get(i);
            if(Math.abs(change) > fluctuation){
                fluctuation = Math.abs(change);
            }
        }
        return fluctuation;
    }

    public double variance(){
        if(this.history.size() < 2){
            return 0;
        }
        double numerator = 0;
        for(Double num : this.history){
            numerator += Math.pow(num - this.average(),2);
        }
        double denominator = this.history.size() - 1;
        return numerator/denominator;
    }
}
