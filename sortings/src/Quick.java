import java.util.*;

public class Quick {

    static void quickSort(int[] arr, int begin, int end) {

        if (begin < end) {

            int position = findPartition(arr, begin, end);

            quickSort(arr, begin, position - 1);
            quickSort(arr, position + 1, end);
        }
    }

    static int findPartition(int[] arr, int begin, int end) {

        int pivot = arr[end];

        int i = begin - 1;

        for (int j = begin; j < end; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {23,453,46,565,4,7,357,35};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}