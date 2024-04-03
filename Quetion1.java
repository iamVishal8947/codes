package rslCodes;

import java.util.Arrays;
import java.util.HashMap;

public class Quetion1 {
	public static void findPair(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				System.out.println("(" + nums[i] + ", " + complement + ")");
				return;
			}
			map.put(nums[i], i);
		}
	}
	
	 public static void findPair2(int[] nums, int target) {
	        Arrays.sort(nums);
	        int left = 0;
	        int right = nums.length - 1;
	        while (left < right) {
	            int sum = nums[left] + nums[right];
	            if (sum == target) {
	                System.out.println("(" + nums[left] + ", " + nums[right] + ")");
	                return;
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        	    }
	public static void main(String[] args) {
		int[] array = { 1, 2, -3, 4, 5 };
		int target = 2;
		findPair(array, target);
	}
}
