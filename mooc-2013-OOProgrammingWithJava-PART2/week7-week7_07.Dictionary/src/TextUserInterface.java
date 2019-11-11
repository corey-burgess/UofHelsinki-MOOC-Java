import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dict = dictionary;
    }

    public void start(){
        while (true){
            System.out.println("Statement: ");
            String input = reader.nextLine();
            if(input.equalsIgnoreCase("quit")){
                System.out.println("Cheers!");
                break;
            }else if (input.equalsIgnoreCase("add")){
                System.out.println("In Finnish: ");
                String finn = reader.nextLine();
                System.out.println("Translation: ");
                String eng = reader.nextLine();
                dict.add(finn,eng);
            }else if(input.equalsIgnoreCase("translate")){
                System.out.println("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + dict.translate(word));
            }else {
                System.out.println("Unknown Statement");
            }
        }
    }
}
