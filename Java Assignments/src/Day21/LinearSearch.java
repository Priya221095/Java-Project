package Day21;
public class LinearSearch
{
    public static void main(String[] args){
        String[] arr = {"My","name","is","Priyanka"};
        String target = "name";
        boolean check = false;

        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals(target)){
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("String " + target + " is present in array");
        }
        else{
            System.out.println("String " + target + " is not present in array");
        }
    }
}
