import java.util.Scanner;

public class Array_sum {
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
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sum of elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            // sum = sum + arr[i]
        }
        System.out.println("\nSum of elements: " + sum);
    }
    }