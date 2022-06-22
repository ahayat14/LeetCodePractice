package app.solutions;

import java.util.HashMap;

public class TwoDarray {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(9 - num)) {
                System.out.println("Index: " + map.get(9 - num) + " , " + i);
            } else {
                map.put(num, i);
            }
        }
    }
}
