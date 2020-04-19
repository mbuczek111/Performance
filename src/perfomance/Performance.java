package perfomance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Performance {
    public static void main(String[] args) {
        long startTime1  = System.currentTimeMillis();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            numbers1.add(0,i);
        }
        long endTime1 = System.currentTimeMillis();

        System.out.println("Add time ArrayList:" + (endTime1-startTime1));

        long startTime2  = System.currentTimeMillis();
        LinkedList<Integer> numbers2 = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            numbers2.add(0,i);
        }
        long endTime2 = System.currentTimeMillis();

        System.out.println("Add time LinkedList:" + (endTime2-startTime2));

        long startTime3  = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            numbers1.get(i);
        }
        long endTime3 = System.currentTimeMillis();

        System.out.println("Get time ArrayList:" + (endTime3-startTime3));

        long startTime4  = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            numbers2.get(i);
        }
        long endTime4 = System.currentTimeMillis();

        System.out.println("Get time LinkedList:" + (endTime4-startTime4));

        System.out.println("Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, " +
                "so no bit shifting is required in memory, as in ArrayList. Hence the better time for adding elements.");
        System.out.println("Accessing data with ArrayList is faster, because it has direct reference to the next element" +
                " whereas LinkedList has to traverse the list from the beginning each time it looks for a element.");


    }
}
