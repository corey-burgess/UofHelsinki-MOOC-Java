package dungeon;

import java.util.ArrayList;
import java.util.Scanner;

public class Dungeon {

    Scanner reader = new Scanner(System.in);
    private int width;
    private int height;
    private int vampCount;
    private int moveCount;
    private boolean vampMove;
    private Player player;
    private ArrayList<Vampire> vampList;


    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.width = length;
        this.height = height;
        this.vampCount = vampires;
        this.moveCount = moves;
        this.vampMove = vampiresMove;
        this.player = new Player(this.height, this.width);
        this.vampList = new ArrayList<Vampire>();
        for(int i = 0; i < this.vampCount; i++){
            vampList.add(new Vampire(this.width,this.height));
        }
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public void run(){
        while(moveCount > 0){
            System.out.println(moveCount+ "\n");
            System.out.println(this.player);
            for(Vampire vamp : vampList){
                System.out.println(vamp);
            }
            System.out.println("\n");
            this.printBoard();
            String input = reader.nextLine();
            player.move(input);
        }
    }

    public void printBoard(){
        String bare = "";
        for(int i = 0; i<this.height; i++){
            for(int j = 0; j<this.width; j++){
                if(this.player.getY() == i && this.player.getX() == j){
                    bare+="@";
                    continue;
                }
                for(Vampire vamp : vampList){
                    if(vamp.getY() == i && vamp.getX() == j){
                        bare+="v";
                    }
                    continue;
                }
                bare+="*";
            }
            bare+="\n";
        }
        System.out.println(bare);
    }
}
