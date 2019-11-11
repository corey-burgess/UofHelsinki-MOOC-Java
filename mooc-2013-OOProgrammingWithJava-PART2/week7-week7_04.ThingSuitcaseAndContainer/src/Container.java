import java.util.*;

public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> cases;

    public Container(int limit) {
        this.maxWeight = limit;
        cases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int addedWeight = 0;
        for (Suitcase name : cases) {
            addedWeight += name.totalWeight();
        }
        if ((addedWeight + suitcase.totalWeight()) <= maxWeight) {
            cases.add(suitcase);
        }
    }

    public String toString() {
        int count = 0;
        int kg = 0;
        for (Suitcase name : cases) {
            count++;
            kg += name.totalWeight();
        }
        if (count == 0) {
            return "empty (0 kg)";
        }else if (count == 1) {
            return count + " suitcase(" + kg + "kg)";
        }else {
            return count + " suitcases (" + kg + "kg)";
        }
    }

    public void printThings() {
        for (Suitcase name : cases) {
            name.printThings();
        }
    }
}
