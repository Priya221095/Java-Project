package Day27;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement
{

    public static void main(String[] args)
    {

        int [] arr = {54, 74, 54, 95, 74};

        Set<Integer> obj = new HashSet<>();
        for(int i =0; i< arr.length; i++)
        {
            if(obj.add(arr[i])){
                continue;
            }
            System.out.println("Duplicate Element: " + arr[i]);
        }

    }
}
