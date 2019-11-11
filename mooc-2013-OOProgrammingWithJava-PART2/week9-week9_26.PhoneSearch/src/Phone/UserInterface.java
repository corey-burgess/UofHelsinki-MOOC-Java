package Phone;

import java.util.Collections;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private ContactInfo directory;

    public UserInterface(Scanner reader){
        this.reader = reader;
        this.directory = new ContactInfo();
    }

    public void Start(){
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit");
        while(true){
            System.out.println("\ncommand: ");
            String command = reader.nextLine();

            if(command.equals("1")){
                System.out.println("whose number: ");
                String name = reader.nextLine();
                System.out.println("number: ");
                String number = reader.nextLine();
                directory.addPhoneNumber(name,number);
            }

            if(command.equals("2")){
                System.out.println("whose number: ");
                String name = reader.nextLine();
                System.out.println(directory.getNumber(name));
            }

            if(command.equals("3")){
                System.out.println("number: ");
                String number = reader.nextLine();
                System.out.println(directory.getPerson(number));
            }

            if(command.equals("4")){
                System.out.println("whose address: ");
                String name = reader.nextLine();
                System.out.println("street: ");
                String street = reader.nextLine();
                System.out.println("city: ");
                String city = reader.nextLine();
                String address = street + " " + city;
                directory.addAddress(name, address);
            }

            if(command.equals("5")){
                System.out.println("whose information: ");
                String name = reader.nextLine();
                System.out.println(directory.personLookup(name));
            }

            if(command.equals("6")){
                System.out.println("whose information: ");
                String name = reader.nextLine();
                directory.removePerson(name);
            }

            if(command.equals("7")){
                System.out.println("keyword (if empty, all listed): ");
                String term = reader.nextLine();
                if(directory.search(term).size() == 0) {
                    System.out.println("  not found");
                }else{
                    for(String name : directory.search(term)) {
                        System.out.println(name);
                        System.out.println(directory.personLookup(name));
                    }
                }
            }

            if(command.equals("x")){
                break;
            }

        }
    }
}
