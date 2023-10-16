import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        Arrays.sort(numbers);
        int[] descendingOrder = new int[n];
        for (int i = 0; i < n; i++) {
            descendingOrder[i] = numbers[n - i - 1];
        }

        
        System.out.println("Sorted numbers in descending order:");
        for (int num : descendingOrder) {
            System.out.println(num);
        }

        scanner.close();
    }
}
