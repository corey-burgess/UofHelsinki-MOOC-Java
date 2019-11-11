package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    private String name;
    private double capacity;
    private double amount;

    public Cow(){
        this.name = NAMES[new Random().nextInt(NAMES.length - 1)];
        this.capacity = new Random().nextInt(26) + 15;
    }

    public Cow(String name){
        this.name = name;
        this.capacity = new Random().nextInt(26) + 15;
    }

    public String getName(){
        return this.name;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getAmount(){
        return Math.ceil(this.amount);
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getAmount() + "/" + this.getCapacity();
    }

    public double milk() {
        double yield = this.getAmount();
        this.amount = 0;
        return yield;
    }

    public void liveHour(){
        double i = new Random().nextDouble();
        double prod = Math.ceil((i * 1.3) + 0.7);
        if(prod > (this.getCapacity() - this.getAmount())){
            this.amount = this.capacity;
        }else {
            this.amount += prod;
        }
    }
}
