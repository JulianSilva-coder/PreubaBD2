package co.edu.unbosque.model;

public class SortingAlgorithms {

    public static void bubbleSort(int[] arrA) {
        if(arrA==null || arrA.length==0) return;

        boolean isSwapped;
        int size = arrA.length;
        for (int i = 0; i <size-1 ; i++) {
            isSwapped = false;
            for (int j = 0; j <size-i-1 ; j++) {
                //check the adjacent elements
                if(arrA[j]<arrA[j+1]){
                    //swap the elements
                    int temp = arrA[j];
                    arrA[j] = arrA[j+1];
                    arrA[j+1] = temp;
                    isSwapped = true;
                }
            }
            //check if any swapping occurred in last iteration
            //if yes then break the loop, array is sorted at this point
            if(!isSwapped)
                break;
        }

    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] < key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = key;
            }
        }
    }

    // Using counting sort to sort the elements in the basis of significant places
    private static void countingSort(int[] array, int size, int place) {
        int[] output = new int[size + 1];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i)
            count[i] = 0;

        // Calculate count of elements
        for (int i = 0; i < size; i++)
            count[(array[i] / place) % 10]++;

        // Calculate cumulative count
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Place the elements in sorted order
        for (int i = size - 1; i >= 0; i--) {
            output[count[(array[i] / place) % 10] - 1] = array[i];
            count[(array[i] / place) % 10]--;
        }

        for (int i = 0; i < size; i++)
            array[i] = output[i];
    }

    // Function to get the largest element from an array
    private static int getMax(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    // Main function to implement radix sort
    public static void radixSort(int[] array, int size) {
        // Get maximum element
        int max = getMax(array, size);

        // Apply counting sort to sort elements based on place value.
        for (int place = 1; max / place > 0; place *= 10)
            countingSort(array, size, place);
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int i = left;
        for(int j = left + 1; j <= right; j++){
            if (arr[j] > pivot){
                i = i + 1;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        return i;

    }

    public static void quickSort(int[] arr, int left, int right){
        if(left < right) {
            int q = partition(arr, left, right);
            quickSort(arr, left, q);
            quickSort(arr, q + 1, right);
        }
    }
}
