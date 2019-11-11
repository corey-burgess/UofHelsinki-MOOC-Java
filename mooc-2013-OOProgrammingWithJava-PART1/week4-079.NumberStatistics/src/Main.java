import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");

        while (true) {
            int i = Integer.parseInt(reader.nextLine());
            if (i == -1) {
                break;
            }
            stats.addNumber(i);
            if (i%2 == 0) {
                even.addNumber(i);
            }else{
                odd.addNumber(i);
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
