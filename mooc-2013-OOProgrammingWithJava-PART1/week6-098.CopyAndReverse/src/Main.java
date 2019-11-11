

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }

    public static int[] copy(int[] array) {
        return array.clone();
    }

    public static int[] reverseCopy(int[] array) {
        int[] copy = new int[array.length];
        int d = 0;
        for (int i=(array.length -1); i>=0; i--) {
            copy[d] = array[i];
            d++;
            }
        return copy;
    }
}
