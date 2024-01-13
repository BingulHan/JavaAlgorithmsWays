package tech.bingulhan.others;

public class FibonacciArray {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 32; // İstenilen Fibonacci serisi eleman sayısı
        System.out.println("Fibonacci series up to " + n + " elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

}
