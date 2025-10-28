public class InsertionSortWM
    {
        public static void insertionSort(int[] arr) {
            int n = arr.length; // arr.length means the length of array or no.of elements in an array
            for (int i = 1; i < n; i++) { //i=1 is the position of the element we are starting to sort
                int key = arr[i]; //here key = arr[element position]
                int j = i - 1;  // here j is the element to be sorted & i-1 is the element at left of element j which we need to compare and sort

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
            public static void main(String[] args){
                int[] arr ={7,6,10,4,8,5}; //providing the elements
                insertionSort(arr);
                for(int val:arr)
                System.out.print(val + " "); //Print output
        }
    }


