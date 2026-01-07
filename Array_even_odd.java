import java.util.Scanner;

public class Array_even_odd {
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
            // Count even and odd
            int even = 0, odd = 0;
            for (i = 0; i < n; i++) {
                if (arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
        }
    }
}