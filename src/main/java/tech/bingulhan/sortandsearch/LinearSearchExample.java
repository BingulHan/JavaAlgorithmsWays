package tech.bingulhan.sortandsearch;

public class LinearSearchExample {


    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Hedef eleman bulunduğunda index'i döndür
            }
        }
        return -1; // Hedef eleman bulunamadığında -1 döndür
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9, 5};
        int target = 7;

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println(target + " found at index " + result);
        } else {
            System.out.println(target + " not found in the array");
        }
    }

}
