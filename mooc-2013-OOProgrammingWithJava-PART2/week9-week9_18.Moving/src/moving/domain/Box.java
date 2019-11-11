package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{

    private int maximumCapacity;
    private List<Thing> Things;

    public Box(int maximumCapacity){
        this.maximumCapacity  = maximumCapacity;
        Things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing){
        int check = this.getVolume() + thing.getVolume();
        if (check > this.maximumCapacity){
            return false;
        }
        Things.add(thing);
        return true;
    }

    public int getVolume(){
        int currentVolume = 0;
        for(Thing thing : Things){
            currentVolume += thing.getVolume();
        }
        return currentVolume;
    }
}
