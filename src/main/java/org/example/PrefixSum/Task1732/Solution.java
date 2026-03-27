package org.example.PrefixSum.Task1732;

public class Solution {

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
    }

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int ans = 0;
        for (int j : gain) {
            sum += j;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
