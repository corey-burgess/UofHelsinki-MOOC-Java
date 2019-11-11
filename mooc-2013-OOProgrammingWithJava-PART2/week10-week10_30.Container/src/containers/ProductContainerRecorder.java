package containers;

public class ProductContainerRecorder extends ProductContainer{

    private ContainerHistory contents;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        contents = new ContainerHistory();
        contents.add(initialVolume);
    }

    public String history(){
        return contents.toString();
    }

    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        contents.add(super.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount){
        double result = super.takeFromTheContainer(amount);
        contents.add(super.getVolume());
        return result;
    }

    public void printAnalysis(){
        String result = "";
        result += "Product: " + super.getName() + "\nHistory: " + this.history() + "\nGreatest product amount: " + contents.maxValue() + "\nSmallest product amount: " + contents.minValue() + "\nAverage: " + contents.average() + "\nGreatest change: " + contents.greatestFluctuation() + "\nVariance: " + contents.variance();
        System.out.println(result);
    }
}
