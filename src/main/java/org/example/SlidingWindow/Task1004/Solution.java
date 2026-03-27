package org.example.SlidingWindow.Task1004;

class Solution {

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{0,0,0,1}, 4));
    }

    public static int longestOnes(int[] nums, int k) {
        int output = 0;
        int zeroesCount = 0;

        for (int start = 0, end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroesCount++;
            }
            if (zeroesCount > k) {
                output = Math.max(output, end - start);
                while (nums[start] != 0) {
                    start++;
                }
                zeroesCount--;
                start++;
            }
            if (end == nums.length - 1) {
                output = Math.max(output, end - start + 1);
            }
        }
        return output;
    }
}