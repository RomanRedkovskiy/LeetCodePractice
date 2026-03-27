package org.example.SlidingWindow.Task1493;

class Solution {

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1,1,1}));
    }

    public static int longestSubarray(int[] nums) {
        int ans = 0;
        int zeroCounter = 0;

        for (int start = 0, end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroCounter++;
            }
            if (zeroCounter == 2) {
                ans = Math.max(ans, end - start - 1);
                while (nums[start] != 0) {
                    start++;
                }
                zeroCounter--;
                start++;
            }
            if (end == nums.length - 1) {
                ans = Math.max(ans, end - start);
            }
        }
        return ans;
    }
}