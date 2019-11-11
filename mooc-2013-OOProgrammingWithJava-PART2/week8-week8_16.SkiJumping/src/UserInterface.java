import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private List<Participants> skiiers;


    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.skiiers = new ArrayList<Participants>();

    }

    public void start(){
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.println("  Participant name:");
            String input = reader.nextLine();
            if(input.isEmpty()){
                break;
            }
            Participants skiier = new Participants(input);
            this.skiiers.add(skiier);
        }
        System.out.println("\nThe tournament begins!");
        int i = 0;
        while(true){
            System.out.println("\nWrite \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();
            Jump jumpRound;
            if (!input.equalsIgnoreCase("jump")){
                break;
            }
            i++;
            System.out.println("Round " + i);
            Collections.sort(skiiers);
            Collections.reverse(skiiers);
            printParticipants();
            System.out.println("\nResults of round " + i);
            for (Participants skiier : skiiers){
                jumpRound = new Jump();
                jumpRound.jumpRound();
                jumpRound.addScore(skiier);
                jumpRound.addLength(skiier);
                printJumps(skiier,jumpRound);
            }
        }
        System.out.println("\nThanks!");
        printResults();
    }

    public void printParticipants(){
        System.out.println("\nJumping order: ");
        for(int i = 1; i<=skiiers.size(); i++){
            System.out.println("  " + i + ". " + skiiers.get(i-1).getName() + " (" + skiiers.get(i-1).getScore() + " points)");
        }
    }

    public void printJumps(Participants skiier, Jump jump){
        System.out.println("  " + skiier.getName());
        System.out.println("    length: " + jump.getLength());
        System.out.println("    judge votes: " + jump.getScores());
    }

    public void printResults(){
        System.out.println("\nTournament results: ");
        System.out.println("Position    Name");
        Collections.sort(skiiers);
        for(int i = 1;i <= skiiers.size();i++){
            System.out.println(i + "           " + skiiers.get(i-1).getName() + "(" + skiiers.get(i-1).getScore() + " points)");
            System.out.println("            jump lengths: " + skiiers.get(i-1).getDistances());
        }
    }

}
