package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {

    private int boxesVolume;
    private List<Box> boxes;

    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }


    public List<Box> packThings(List<Thing> things){
        boxes = new ArrayList<Box>();
        boxes.add(new Box(this.boxesVolume));
        int box = 0;
        int thing = 0;
        while(thing < things.size()){
            boolean add = boxes.get(box).addThing(things.get(thing));
            if (!add){
                box++;
                continue;
            }
            thing++;
        }
       return boxes;
    }
}
