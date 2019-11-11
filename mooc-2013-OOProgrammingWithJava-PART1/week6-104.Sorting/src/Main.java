import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }

    public static int smallest(int[] array) {
        int smallestYet = array[0];
        for(int i : array) {
            if(i < smallestYet) {
                smallestYet = i;
            }
        }
        return smallestYet;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestIndex = 0;
        for(int i = 0;i<array.length;i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startingIndex) {
        int smallestIndex = startingIndex;
        for(int i = startingIndex; i < array.length; i++) {
            if(array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;
    }

    public static void sort(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.println(Arrays.toString(array));
            int smallest = indexOfTheSmallestStartingFrom(array,i);
            swap(array, i, smallest);
        }
    }

}
