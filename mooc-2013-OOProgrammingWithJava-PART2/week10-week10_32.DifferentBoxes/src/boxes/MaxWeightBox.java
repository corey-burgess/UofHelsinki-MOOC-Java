package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{

    private int maxWeight;
    private List<Thing> items;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int totalWeight = 0;
        for(Thing t : items){
            totalWeight += t.getWeight();
        }

        if(totalWeight + thing.getWeight() <= maxWeight){
            items.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return items.contains(thing);
    }
}
