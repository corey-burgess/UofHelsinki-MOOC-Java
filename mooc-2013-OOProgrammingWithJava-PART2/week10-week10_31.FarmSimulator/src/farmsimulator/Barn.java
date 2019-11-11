package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank barnTank;
    private MilkingRobot barnRobot;

    public Barn(BulkTank tank){
        this.barnTank = tank;
    }

    public BulkTank getBulkTank(){
        return this.barnTank;
    }

    public void installMilkingRobot(MilkingRobot robot){
        this.barnRobot = robot;
        this.barnRobot.setBulkTank(this.barnTank);
    }

    public void takeCareOf(Cow cow){
        try {
            this.barnRobot.milk(cow);
        }catch(Exception e){
            throw new IllegalStateException();
        }
    }

    public void takeCareOf(Collection<Cow> cows){
        try{
            for(Cow cow : cows){
                this.barnRobot.milk(cow);
            }
        }catch(Exception e){
            throw new IllegalStateException();
        }
    }

    @Override
    public String toString(){
        return this.barnTank.toString();
    }
}
