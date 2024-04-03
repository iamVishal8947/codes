package rslCodes;

public class Quetion7 {
    public static int findMaxDifference(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should contain at least two elements");
            return -1; // Return -1 to indicate error
        }

        int minElement = arr[0];
        int maxDifference = 0;

        // Iterate through the array to find the minimum element and the maximum difference
        for (int i = 1; i < arr.length; i++) {
            maxDifference = Math.max(maxDifference, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }

        return maxDifference;
    }

    public static void main(String[] args) {
        int[] arr = {14, 12, 70, 15, 95, 65, 22, 30};
        int maxDifference = findMaxDifference(arr);
        System.out.println("First max-difference: " + maxDifference);
    }
}

