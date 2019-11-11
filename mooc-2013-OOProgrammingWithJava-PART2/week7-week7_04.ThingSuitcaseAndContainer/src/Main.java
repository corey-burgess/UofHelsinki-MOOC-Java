public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        int i = 1;
        while (i < 101) {
            Thing brick = new Thing("Brick", i);
            Suitcase roll = new Suitcase(i);
            roll.addThing(brick);
            container.addSuitcase(roll);
            i++;
        }
    }
}