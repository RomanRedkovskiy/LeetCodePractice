package org.example.PrefixSum.Task724;

public class Solution {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-5,1,5,0,-7}));
    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            if (i > 0) {
                leftSum += nums[i - 1];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
