package org.example.Stack.Task394;

import java.util.Arrays;
import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }

    public static String decodeString(String s) {
        char currentChar;
        Stack<Character> charStack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder numbersBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if (currentChar == ']') {
                while (charStack.peek() != '[') {
                    stringBuilder.append(charStack.pop());
                }
                stringBuilder.reverse();
                charStack.pop(); // popping '['

                while (!charStack.isEmpty() && charStack.peek() >= '0' && charStack.peek() <= '9') {
                    numbersBuilder.append(charStack.pop());
                }

                stringBuilder.append(stringBuilder.toString().repeat(
                        Integer.parseInt(numbersBuilder.reverse().toString()) - 1));

                for (char c : stringBuilder.toString().toCharArray()) {
                    charStack.push(c);
                }

                stringBuilder.setLength(0);
                numbersBuilder.setLength(0);
            } else {
                charStack.push(currentChar);
            }
        }

        while (!charStack.isEmpty()) {
            stringBuilder.append(charStack.pop());
        }

        return stringBuilder.reverse().toString();
    }
}