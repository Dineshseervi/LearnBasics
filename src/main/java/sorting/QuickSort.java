package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        // 7 6 10 5 9  2 1 15 7
        // pivot 7
        // lb 0
        // ub size
        int[] A = {7, 6, 10, 5, 9, 2, 1, 15, 7};
        System.out.println("array1 /n array2");
        System.out.println("array " + Arrays.toString(A));
        QuickSort quickSort = new QuickSort();

        quickSort.quickSorting(A, 0, A.length - 1);
        System.out.println("array " + Arrays.toString(A));


    }

    public void quickSorting(int[] array, int lb, int ub) {
        if (lb < ub) {
            // System.out.println("++ loop");
            int end = partition(array, lb, ub);
            quickSorting(array, lb, end - 1);
            // System.out.println("-- loop");
            quickSorting(array, end + 1, ub);
        }
    }

    public int partition(int[] array, int lb, int ub) {

        int pivit = array[lb];
        int start = lb;
        int end = ub;
        while (start < end) {
            while (array[start] <= pivit && start < end) {
                start++;
            }

            while (array[end] > pivit) {
                end--;
            }
            if (start < end) {
                swap(array, start, end);
            }
        }
        return end;
    }

    public void swap(int[] array, int start, int end) {
        int value1 = array[start];
        array[start] = array[end];
        array[end] = value1;
    }
}
