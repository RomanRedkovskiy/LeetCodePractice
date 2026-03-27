package org.example.ArraysStringAndHashing.Task238;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] ans = new int[nums.length];

        pre[0] = 1;
        suf[nums.length - 1] = 1;

        for(int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
            suf[nums.length - 1 - i] = suf[nums.length - i] * nums[nums.length - i];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = pre[i] * suf[i];
        }

        return ans;
    }
}