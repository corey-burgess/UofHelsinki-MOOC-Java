package dungeon;

import java.util.Random;

public class Vampire {

    private int x;
    private int y;
    private int maxWidth;
    private int maxHeight;

    public Vampire(int x, int y){
        this.x = new Random().nextInt(x + 1);
        this.y = new Random().nextInt(y + 1);
        this.maxWidth = x;
        this.maxHeight = y;
    }

    public void move(){
        this.x = new Random().nextInt(maxWidth + 1);
        this.y = new Random().nextInt(maxHeight + 1);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    @Override
    public String toString(){
        return "v " + this.x + " " + this.y;
    }
}
