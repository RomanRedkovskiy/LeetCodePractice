package org.example.ArraysStringAndHashing.Task19_LinkedLists;

class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(1455641));
    }

    public static boolean lengthOfLongestSubstring(int number) {

        String s = String.valueOf(number);

        for (int i = 0; i < s.length() / 2 + 1; i++) {
            if (s.charAt(i) != (s.charAt(s.length() - i - 1))) {
                return false;
            }
        }

        return true;
    }
}
