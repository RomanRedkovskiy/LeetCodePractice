package org.example.TwoPointers.Task11;

class Solution {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{2,3,4,5,18,17,6}));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        // int maxLeftIndex = i;
        // int maxRightIndex = j;
        int currentArea;
        int maxArea = 0;

        while (i < j) {
            currentArea = Math.min(height[i], height[j]) * (j - i);
            if (currentArea >= maxArea) {
                maxArea = currentArea;
            }
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}