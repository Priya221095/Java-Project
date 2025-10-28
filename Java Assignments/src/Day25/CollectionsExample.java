package Day25;

import java.util.ArrayList;
import java.util.Collections;
public class CollectionsExample
{
    public static void main(String[] args) {
        // Creating a list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(85);
        numbers.add(14);
        numbers.add(45);
        numbers.add(35);

        // Printing elements before sorting
        System.out.println("Print number: " + numbers);

        //Sorting the list
        Collections.sort(numbers);
        System.out.println("Print number after sorting: " + numbers);

        // Min and Max numbers
        System.out.println("Minimum number: " + Collections.min(numbers));
        System.out.println("Maximum number: " + Collections.max(numbers));

        //Reverse the numbers
        Collections.reverse(numbers);
        System.out.println("After reversing: " + numbers);
    }
}
