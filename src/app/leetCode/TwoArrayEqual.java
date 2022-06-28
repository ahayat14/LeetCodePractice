package app.leetCode;

import java.util.Arrays;

public class TwoArrayEqual {

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);

    }
}
