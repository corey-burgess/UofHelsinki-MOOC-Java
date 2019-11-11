package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{

    private List<Movable> movList = new ArrayList<Movable>();

    public String toString(){
        String result = "";
        for(Movable thing : movList){
            result += thing.toString() + "\n";
        }
        return result;
    }

    public void addToGroup(Movable movable){
        movList.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable thing : movList){
            thing.move(dx,dy);
        }
    }
}
