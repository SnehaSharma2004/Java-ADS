package Class;

import java.util.*;
import java.io.*;

public class MinSize {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0;
        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];
            while (currSum >= target) {
                if (right - left + 1 < len) {
                    len = right - left + 1;
                }
                currSum -= nums[left];
                left++;
            }
        }
        return len != Integer.MAX_VALUE ? len : 0;
    }

    public static void main(String[] args) {
        MinSize minSize = new MinSize();
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        System.out.println(minSize.minSubArrayLen(target, nums));
    }
}
