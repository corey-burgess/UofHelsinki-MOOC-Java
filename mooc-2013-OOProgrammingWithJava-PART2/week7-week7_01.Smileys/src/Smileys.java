
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        //printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        if (characterString.length() % 2 == 0) {
            int length = characterString.length() + 6;
            System.out.println(printSmileys(length/2));
            System.out.println(printSmileys(1) + " " + characterString + " " + printSmileys(1));
            System.out.println(printSmileys(length/2));
        }else{
            int length = characterString.length() + 7;
            System.out.println(printSmileys(length/2));
            System.out.println(printSmileys(1) + " " + characterString + "  " + printSmileys(1));
            System.out.println(printSmileys(length/2));
        }
    }


    private static String printSmileys(int q) {
        String smileys = "";
        int i = 0;
        while (i<q) {
            smileys += ":)";
            i++;
        }
        return smileys;
    }

}
