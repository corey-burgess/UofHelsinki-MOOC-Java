import java.util.ArrayList;

public class Box implements ToBeStored{

    private ArrayList<ToBeStored> box;
    private double maxWeight;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.box = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing){
        if (weight() + thing.weight() <= maxWeight){
            box.add(thing);
        }
    }

    public double weight(){
        double weight = 0;
        for (ToBeStored thing : box){
            weight += thing.weight();
        }
        return weight;
    }

    public String toString(){
        return "Box: " + box.size() + " things, total weight " + this.weight() + " kg";
    }
}
