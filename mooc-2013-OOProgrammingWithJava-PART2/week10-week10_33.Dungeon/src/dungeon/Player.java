package dungeon;

public class Player {

    private int x;
    private int y;
    private int maxX;
    private int maxY;

    public Player(int maxHeight, int maxWidth){
        this.x = 0;
        this.y = 0;
        this.maxX = maxWidth;
        this.maxY = maxHeight;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void move(String move){
        String up = move.toLowerCase();
        for(int i = 0; i < move.length(); i++){
            char x = move.charAt(i);
            if(x == 'w' && this.y > 0){
                this.y--;
            }
            if(x == 's' && this.y < maxY){
                this.y++;
            }
            if(x == 'a' && this.x > 0){
                this.x--;
            }
            if(x == 'd' && this.x < this.maxX){
                this.x++;
            }
        }
    }

    @Override
    public String toString(){
        return "@ " + this.getX() + " " + this.getY();
    }
}
