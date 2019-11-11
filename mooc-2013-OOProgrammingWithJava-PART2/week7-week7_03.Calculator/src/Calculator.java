public class Calculator {

    private Reader reader;
    private int stats;

    public Calculator() {
        reader = new Reader();
        stats = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        stats++;
        System.out.println("Value1: ");
        int value1 = reader.readInteger();
        System.out.println("Value2: ");
        int value2 = reader.readInteger();
        System.out.println("sum of the values: " + (value1 + value2));
    }

    private void difference() {
        stats++;
        System.out.println("Value1: ");
        int value1 = reader.readInteger();
        System.out.println("Value2: ");
        int value2 = reader.readInteger();
        System.out.println("difference of the values: " + (value1 - value2));
    }

    private void product() {
        stats++;
        System.out.println("Value1: ");
        int value1 = reader.readInteger();
        System.out.println("Value2: ");
        int value2 = reader.readInteger();
        System.out.println("product of the values: " + (value1 * value2));
    }

    private void statistics() {
        System.out.println("Calculations done " + stats);
    }
}
