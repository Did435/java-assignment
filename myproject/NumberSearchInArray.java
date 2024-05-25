import java.util.Scanner;

public class NumberSearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Input: Array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input: Number to search for
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        // Search logic
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println(target + " was found in the array.");
        } else {
            System.out.println(target + " was not found in the array.");
        }
    }
}
