package tech.bingulhan.sortandsearch;

public class BinarySearchExample {

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Eğer hedef değer ortanca elemana eşitse, index'i döndür
            if (array[mid] == target) {
                return mid;
            }

            // Eğer hedef değer ortanca elemandan küçükse, aramanın sol tarafına odaklan
            if (array[mid] > target) {
                right = mid - 1;
            }
            // Eğer hedef değer ortanca elemandan büyükse, aramanın sağ tarafına odaklan
            else {
                left = mid + 1;
            }
        }

        return -1; // Hedef eleman bulunamadığında -1 döndür
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 7, 9, 12, 15, 18};
        int target = 7;

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

}
