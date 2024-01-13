package tech.bingulhan.sortandsearch;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * Bumblesort, elemanları rastgele yer değiştirerek bir diziyi "sıralayan" basit bir algoritma olarak tasarlanmıştır. Bu nedenle, gerçek bir sıralama algoritması olarak kullanılması pek önerilmez.
 *
 */

public class BumbleSortExample {



    public static void bumblesort(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length - 1; i++) {
            // Elemanları rastgele yer değiştir
            int randomIndex = random.nextInt(array.length - i) + i;
            swap(array, i, randomIndex);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 9, 1, 3};
        System.out.println("Before bumblesort: " + Arrays.toString(array));

        bumblesort(array);

        System.out.println("After bumblesort: " + Arrays.toString(array));
    }

}
