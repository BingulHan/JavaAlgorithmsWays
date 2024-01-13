package tech.bingulhan.sortandsearch;

import java.util.Arrays;

public class InsertionSortExample {

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Sıralı kısmı dolaşarak key'in uygun yerini bul
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Before insertion sort: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("After insertion sort: " + Arrays.toString(array));
    }

}
