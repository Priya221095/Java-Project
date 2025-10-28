public class LinearSearch
{
    public static void main(String[] args){
        String [] arr = {"Priyanka","Riddhi","Tushar"}; // Elements
        String target = "Riddhi";   // value that needs to be searched

        int index = -1;
        for(int i=0;i<arr.length;i++){ // iteration of values
            if(arr[i] == target){  // comparison between arr[] = target value
                index=i;
                break;
            }
        }
        System.out.println("Found at index: " + index);
    }
}
