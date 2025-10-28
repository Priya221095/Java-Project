package Day25;
import java.util.ArrayList;
public class ArrayListExample
{
    public static void main(String[] args) {
        // add() Adds an element to the collection
        ArrayList<String> coll = new ArrayList<>();
        coll.add("Dog");
        coll.add("Cat");
        coll.add("Lion");
        System.out.println("1. Animals list: " + coll);

        // addAll() It will add all elements from another collection
        ArrayList<String> coll2 = new ArrayList<>();
        coll2.add("Cheetah");
        coll2.addAll(coll);
        System.out.println("2. Animal added: " +coll2);

        // remove() this function will help to remove elements
         coll.remove("Cat");
        System.out.println("3. Animals list after removing 1 animal: " + coll);

        //contains() this will help to check if the element is present
        System.out.println("4(a) " + coll.contains("Lion"));
        System.out.println("4(b) " + coll.contains("Cat"));

        //size() this will define the no.of elements in the list
        System.out.println("5. Number of animals: " + coll.size());

        //removeAll() this will remove all elements from another collection
        coll.removeAll(coll2);
        System.out.println("6. Animals after removeAll function: " + coll);
    }
}
