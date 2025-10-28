package Day26;
import java.util.Iterator;

public class ArrayList
{
    public static void main(String[] args)
    {

        java.util.ArrayList<Object> list = new java.util.ArrayList<>();
        //add()
        list.add("Apple");
        list.add("150");
        list.add(true);
        list.add(3.14f);
        list.add(1,"orange");

        //remove()
        list.remove("Apple");
        list.remove(2);
        System.out.println("1" + list);

        System.out.println("2:" + list.contains("orange"));//Contain()
        System.out.println("3:" + list.getLast()); //getLast()
        System.out.println("4:" + list.size()); //size()
        System.out.println("5:" + list.isEmpty());//isEmpty()

        //get()
        System.out.println("6:" + list.get(0));
        System.out.println("7:" + list);

        //set()
        list.set(0,"Banana");
        System.out.println("8:" + list);

        //Retrieval of Data from Arraylist
        //using for loop
        for(int i =0;i<list.size();i++){
            System.out.println("9:" +list.get(i));
        }

        //USing For each
        for (Object element :list){
            System.out.println("10:" +element);
        }

        //using Iterator
        Iterator<Object> it = list.iterator();
        while (it.hasNext()){
            System.out.println("11:" +it.next());

        }
    }
}
