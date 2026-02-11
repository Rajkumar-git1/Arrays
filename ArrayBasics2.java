import java.util.*;

public class ArrayBasics2 {

    // Utility method
    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    // 1. Find Second Largest
    static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }
        return second;
    }

    // 2. Find Second Smallest
    static int secondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x < min) {
                second = min;
                min = x;
            } else if (x < second && x != min) {
                second = x;
            }
        }
        return second;
    }

    // 3. Check Palindrome
    static boolean isPalindrome(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

    // 4. Check if array is sorted
    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    // 5. Find Average
    static double average(int[] arr) {
        int sum = 0;
        for (int x : arr)
            sum += x;
        return (double) sum / arr.length;
    }

    // 6. Count Frequency
    static void frequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);

        System.out.println("Frequencies: " + map);
    }

    // 7. Find Prime Numbers
    static void printPrimes(int[] arr) {
        System.out.print("Prime numbers: ");
        for (int x : arr) {
            if (isPrime(x))
                System.out.print(x + " ");
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    // 8. Replace each element with square
    static void replaceWithSquare(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] * arr[i];
    }

    // 9. Replace each element with sum of others
    static void replaceWithSumOfOthers(int[] arr) {
        int totalSum = 0;
        for (int x : arr)
            totalSum += x;

        for (int i = 0; i < arr.length; i++)
            arr[i] = totalSum - arr[i];
    }

    // 10. Difference between max and min
    static int diffMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        return max - min;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 2, 7, 4};

        System.out.print("Array: ");
        printArray(arr);

        System.out.println("Second Largest: " + secondLargest(arr));
        System.out.println("Second Smallest: " + secondSmallest(arr));
        System.out.println("Is Palindrome: " + isPalindrome(arr));
        System.out.println("Is Sorted: " + isSorted(arr));
        System.out.println("Average: " + average(arr));

        frequency(arr);
        printPrimes(arr);

        replaceWithSquare(arr);
        System.out.print("Replace with square: ");
        printArray(arr);

        replaceWithSumOfOthers(arr);
        System.out.print("Replace with sum of others: ");
        printArray(arr);

        System.out.println("Difference (Max - Min): " + diffMaxMin(arr));
    }
}
