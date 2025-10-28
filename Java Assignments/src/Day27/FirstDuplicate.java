package Day27;
import java.util.HashSet;

public class FirstDuplicate {
    public static void main(String[] args)
    {

        int[] arr = {22, 12, 22, 12, 54, 78};

        HashSet<Integer> obj = new HashSet<>();
        for(int i=0; i< arr.length; i++)
        {
            if(!obj.add(arr[i]))
            {
                System.out.println("First Duplicate Element: " +arr[i]);
                return;
            }
        }
        System.out.println("No Duplicate Found");
    }
}

