package tech.bingulhan.sortandsearch;

import java.util.Arrays;

public class SelectionSortExample {


    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Minimum elemanın indexini bul
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Minimum elemanı şu anki elemanla değiştir
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Before selection sort: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("After selection sort: " + Arrays.toString(array));
    }

}
