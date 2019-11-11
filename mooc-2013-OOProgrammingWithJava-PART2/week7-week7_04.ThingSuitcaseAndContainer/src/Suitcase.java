import java.util.*;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int max) {
        this.maxWeight = max;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing){
        int addedWeight = 0;
        for (Thing name : things) {
            addedWeight += name.getWeight();
            }
        if ((addedWeight + thing.getWeight()) <= maxWeight) {
            things.add(thing);
        }
    }

    public String toString(){
        int count = 0;
        int kg = 0;
        for (Thing name : things) {
            count++;
            kg += name.getWeight();
        }
        if (count == 0) {
            return "empty (0 kg)";
        }else if (count == 1) {
            return count + " thing (" + kg + "kg)";
        }else {
            return count + " things (" + kg + "kg)";
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int addedWeight = 0;
        for (Thing name : things) {
            addedWeight += name.getWeight();
        }
        return addedWeight;
    }

    public Thing heaviestThing() {
        Thing heaviest = new Thing("null",0);
        for (Thing thing : things) {
            if (heaviest.getWeight() <= thing.getWeight()) {
                heaviest = thing;
            }
        }
        if (heaviest.getWeight() == 0){
            return null;
        }else {
            return heaviest;
        }
    }

}
