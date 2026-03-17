package org.example.Stack.Task2390_RemovingStarsFromAString;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : stack) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

}
