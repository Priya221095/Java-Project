package Day26;
import java.util.Set;
public class HashSet {
    public static void main(String[] args)
    {
        Set<Object> list = new java.util.HashSet<>();
        //add()
        list.add("Apple");
        list.add("150");
        list.add(true);
        list.add(90);
        list.add(3.14f);

        //remove()
        list.remove("Apple");
        list.remove(2);
        System.out.println("This is a List:" +list);

        System.out.println(list.contains("orange"));//Contain()
        System.out.println(list.size()); //size()
        System.out.println(list.isEmpty());//isEmpty()

        //Creating  List1
        Set<Object> list1 =new java.util.HashSet<>();
        list1.add("S");    list1.add(9);
        System.out.println("List1: " +list1);

        //Adding Two list
        Set<Object> list2 = new java.util.HashSet<>();
        list2.addAll(list);
        list2.addAll(list1);
        System.out.println("List2: " +list2);

        // 6. removeAll() function
        list2.removeAll(list2);
        System.out.println("After removing all the Elements from list2: " + list2);


    }

}

























































