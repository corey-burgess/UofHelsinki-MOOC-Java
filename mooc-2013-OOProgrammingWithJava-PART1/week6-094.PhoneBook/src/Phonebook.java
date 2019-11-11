import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> book = new ArrayList<Person>();

    public void add(String name, String number){
        Person person = new Person(name, number);
        book.add(person);
    }

    public void printAll(){
        for (Person person : book) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : book) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
