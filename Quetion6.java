package rslCodes;

public class Quetion6 {
    public static void printTriangle(int n) {
        int num = 1; // Initialize the starting number
        for (int i = 1; i <= n; i++) {
            // Print leading spaces to align the triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers for the current row
            int currentNum = 1; // Initialize the first number of the row
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum + " ");
                // Calculate the next number for the row
                currentNum = currentNum * (i - j) / j;
            }
            System.out.println(); // Move to the next line for the next row
        }
    }

    public static void main(String[] args) {
        int size = 6;
        printTriangle(size);
    }
}
