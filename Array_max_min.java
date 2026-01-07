import java.util.Scanner;

public class Array_max_min {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array
        System.out.println("\nArray elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Find maximum
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nMaximum element: " + max);

        // Find minimum
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);

    }
}