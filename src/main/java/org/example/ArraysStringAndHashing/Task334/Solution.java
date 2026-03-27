package org.example.ArraysStringAndHashing.Task334;

class Solution {

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,3}));
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < first) {
                first = num;
            } else if (num > first && num < second) {
                second = num;
            }
            if (num > second) {
                return true;
            }
        }

        return false;
    }
}