package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive{

    private String owner;
    private Barn farmBarn;
    private List<Cow> herd;

    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.farmBarn = barn;
        this.herd = new ArrayList<Cow>();
    }

    public String getOwner(){
        return this.owner;
    }

    public void addCow(Cow cow){
        this.herd.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot){
        this.farmBarn.installMilkingRobot(robot);
    }

    public void manageCows(){
        for(Cow cow : this.herd){
            this.farmBarn.takeCareOf(cow);
        }
    }

    @Override
    public void liveHour() {
        for(Cow cow : this.herd){
            cow.liveHour();
        }
    }
}
