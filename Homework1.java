import java.math.BigInteger;
import java.util.Arrays;

public class Homework1 {

    public static void main(String[] args) {
        // тут можете тестировать ваш код

        convert(10);
        System.out.println(normalize(721));
        System.out.println(max(10, 12, -14));
        System.out.println(fact(12));
        System.out.println(fact(BigInteger.valueOf(30)));
        multiplTable();
        System.out.println(average(1, 2, 3, 4, 5, 6, 7));
        System.out.println(isMagicSquare(new int[][]{
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}}));
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(sort(new int[]{2, 1, 45, 34, 12, 2})));
        System.out.println(Arrays.toString(removeExtra(new int[]{2, 1, 45, 2, 34, 1, 12, 2}, 2)));
    }

    // task 1
    static void convert(int arg) {
        System.out.println(Long.toBinaryString(arg));
        System.out.println(Long.toOctalString(arg));
        System.out.println(Long.toHexString(arg));
    }


    // task 2
    static int normalize(int angle) {
        angle %= 360;
        return angle;
    }


    // task 3
    static int max(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                return x;
            }
            else {
                return z;
            }
        }
        else {
            if (y > z) {
                return y;
            }
            else {
                return z;
            }
        }
    }


    // task 4
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n-1);
    }


    // task 5
    static BigInteger fact(BigInteger n) {
        BigInteger fac = BigInteger.valueOf(30);
        long m = n.longValue();
        while (m > 1) {
            fac = fac.multiply(n);
            n = n.subtract(BigInteger.valueOf(1));
            m = n.longValue();
        }
    return fac;
    }

    // task 6
    static void multiplTable() {
        // Ваш код здесь
    }


    // task 7
    static double average(int... nums) {
        int a = 0;
        for (int i = 0; i < nums.length; ++i) {
            a += nums[i];
        }
        return a/ nums.length;
    }


    // task 8
    static boolean isMagicSquare(int[][] square) {

        return false;
    }


    // task 9
    static int[] reverse(int[] arr) {
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            brr[i] = arr[arr.length - i - 1];
        }
        return brr;
    }


    // task 10
    static int[] sort(int[] arr) {
        // Ваш код здесь
        return null;
    }


    // task 11
    static int[] removeExtra(int[] arr, int n) {
        // Ваш код здесь
        return null;
    }
}