package moving.domain;

public class Item implements Thing,Comparable<Item>{

    private String name;
    private int volume;

    public Item(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public String getName(){
        return this.name;
    }

    public int getVolume(){
        return this.volume;
    }

    public String toString(){
        return getName() + " (" + getVolume() + " dm^3)";
    }

    public int compareTo(Item comparable){
       return this.getVolume() - comparable.getVolume();
    }
}
