package Day27;
import java.util.HashMap;
public class DuplicateHashMap
{

    public static void main(String[] args)
    {
        int [] arr = {30, 44, 78, 44, 98};

        HashMap<Integer,Integer> obj = new HashMap<>();

        for(int i = 0; i< arr.length; i++)
        {
            obj.put(arr[i],obj.getOrDefault(arr[i],0) +1);
        }
        for(int key: obj.keySet())
        {
            if(obj.get(key) > 1)
            {
                System.out.println("Duplicate Element: " +key);
            }
        }
    }

}
