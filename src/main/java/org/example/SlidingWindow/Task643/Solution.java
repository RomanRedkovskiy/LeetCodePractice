package org.example.SlidingWindow.Task643;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{0,1,1,3,3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        return (double) maxSum / k;
    }
}