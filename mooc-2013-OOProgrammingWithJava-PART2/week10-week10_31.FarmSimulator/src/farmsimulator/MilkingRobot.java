package farmsimulator;

public class MilkingRobot {

    private BulkTank connected;

    public MilkingRobot(){

    }

    public BulkTank getBulkTank(){
        return this.connected;
    }

    public void setBulkTank(BulkTank tank){
        this.connected = tank;
    }

    public void milk(Milkable milkable){
        try {
            double yield = milkable.milk();
            this.connected.addToTank(yield);
        }catch(Exception e){
            throw new IllegalStateException();

        }
    }
}
