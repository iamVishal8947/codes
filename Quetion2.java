package rslCodes;

public class Quetion2 {
    public static void printMaxPairProduct(int[] nums) {
        if (nums.length < 2) {
            System.out.println("Array should contain at least two elements");
            return;
        }

        // Initialize maximum, second maximum, minimum, and second minimum variables
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        // Find maximum and second maximum, minimum and second minimum elements in the array
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Print the maximum of product of maximum two numbers or product of minimum two numbers
        System.out.println(Math.max(max1 * max2, min1 * min2));
    }

    public static void main(String[] args) {
        int[] array = {-15, -20, -100, 200, -30, 30};
        printMaxPairProduct(array);
    }
}


