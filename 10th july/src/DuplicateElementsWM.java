// Program to find duplicate elements using Brute force with function

public class DuplicateElementsWM {
        public static void findDuplicate(int[] arr) {
            for (int i = 0; i < arr.length; i++) { // i=0 means example i=2; this will continue until the length of array
                for (int j = i + 1; j < arr.length; j++) {  // j= (i+1) means example j=4; this will compare elements of i and j
                    if (arr[i] == arr[j]) {  // this condition is to find duplicate element
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }
            public static void main(String[] args){
            int[] arr = {2, 4, 8, 1, 4, 8};
            DuplicateElementsWM obj = new DuplicateElementsWM(); // object creation
            obj.findDuplicate(arr);                              // calling method
            System.out.println("Duplicate element is: ");
        }
    }




