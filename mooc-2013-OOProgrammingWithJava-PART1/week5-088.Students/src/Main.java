
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("name: ");
            String studentName = reader.nextLine();
            if (studentName.isEmpty()){
                break;
            }
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add( new Student(studentName,studentNumber));
        }
        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        for (Student student : list) {
            if (student.getName().contains(search)){
                System.out.println(student);
            }
        }
    }
}
