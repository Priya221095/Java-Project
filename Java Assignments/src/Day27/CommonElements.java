package Day27;
import java.util.ArrayList;
import java.util.HashMap;
public class CommonElements {
    public static void main(String[] args)
    {
//Creating array List
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(34);
        list.add(45);
        System.out.println("Array List " +list);
        //Creating HashMap List
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1 , "Priya");
        hash.put(2 , "Riya");
        hash.put(3 , "Neha");
        hash.put(4 , "Riya");
        System.out.println("HashMap List " + hash);

        boolean found = false;
        for(int i = 0; i <list.size(); i++)
        {
            int item = list.get(i);
            if(hash.containsKey(item))
            {
                found = true;
                System.out.println("Common Element in ArrayList and HashMap: " +item);
            }

        }
        if(!found)
        {
            System.out.println("No Common Element Found");
        }
    }
}
