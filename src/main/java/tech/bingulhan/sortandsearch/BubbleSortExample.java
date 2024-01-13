package tech.bingulhan.sortandsearch;

import java.util.Arrays;

public class BubbleSortExample {

        public static void bubbleSort(int[] array) {
            int n = array.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    // Komşu elemanları karşılaştır ve gerekirse yer değiştir
                    if (array[j] > array[j + 1]) {
                        // Swap
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("Before bubble sort: " + Arrays.toString(array));

            bubbleSort(array);

            System.out.println("After bubble sort: " + Arrays.toString(array));
        }

}
