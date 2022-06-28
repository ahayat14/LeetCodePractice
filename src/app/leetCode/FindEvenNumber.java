package app.leetCode;

public class FindEvenNumber {
    public int findNumbers(int[] nums) {
        int count = 0;
        int findNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                findNumbers++;
            }
            count = 0;
        }

        return findNumbers;

    }
}
