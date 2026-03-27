package org.example.Stack.Task735;

import java.util.Arrays;
import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{3,5,-6,2,-1,4})));
    }

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        int previousAsteroid;
        boolean shouldAddLastAsteroid;

        for (int currentAsteroid : asteroids) {
            shouldAddLastAsteroid = true;

            if (currentAsteroid < 0) {
                while (shouldAddLastAsteroid && !stack.isEmpty() && stack.peek() > 0) {
                    previousAsteroid = stack.peek();
                    if (previousAsteroid + currentAsteroid < 0) {
                        stack.pop();
                    } else if (previousAsteroid + currentAsteroid == 0) {
                        stack.pop();
                        shouldAddLastAsteroid = false;
                    } else {
                        shouldAddLastAsteroid = false;
                    }
                }
            }

            if (shouldAddLastAsteroid) {
                stack.push(currentAsteroid);
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}