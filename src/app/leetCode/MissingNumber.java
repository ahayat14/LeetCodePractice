package app.leetCode;

import java.util.Arrays;

public class MissingNumber {
    public int findMissingNumbers(int[] nums) {
        int m = nums.length;
        int total = m * (m + 1) / 2;
        int sum = Arrays.stream(nums).sum();
        return total - sum;
    }
}
