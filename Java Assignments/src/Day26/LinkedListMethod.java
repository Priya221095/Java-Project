package Day26;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListMethod {

    public static void main(String[] args) {

        LinkedList<Object> linkedList = new LinkedList<>();

        //add()
        linkedList.add("Apple");
        linkedList.add("150");
        linkedList.add(true);
        linkedList.add(3.14f);
        linkedList.add(1, "orange");

        //remove()
        linkedList.remove("Apple");
        linkedList.remove(2);
        System.out.println(linkedList);

        //Contain()
        System.out.println(linkedList.contains("orange"));
        System.out.println(linkedList.getLast()); //getLast()
        System.out.println(linkedList.size()); //size()
        System.out.println(linkedList.isEmpty());//isEmpty()

        //get()
        System.out.println(linkedList.get(0));
        System.out.println(linkedList);

        //set()
        linkedList.set(0, "Banana");
        System.out.println(linkedList);

        // 5. addAll() - Add multiple elements from another list
        LinkedList<Object> linkedList1 = new LinkedList<>();
        linkedList1.add("green");
        linkedList1.add("Blue");
        System.out.println("After adding more Elements: " + linkedList1);

        // 6. removeAll() function
        linkedList1.removeAll(linkedList1);
        System.out.println("After removal of all the Elements: " + linkedList1);

        //Retrieval of Data from Arraylist
        //using for loop
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //USing For each
        for (Object element : linkedList) {
            System.out.println(element);
        }

        //using Iterator
        Iterator<Object> it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}

