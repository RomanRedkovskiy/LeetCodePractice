package org.example.ArraysStringAndHashing.Task1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;

        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
