package org.example.TwoPointers.Task392_IsSubsequence;

class Solution {

    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int sCounter = 0;

        if (s.isEmpty()) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(sCounter)) {
                sCounter++;
            }
            if (sCounter > 0 && sCounter == s.length()) {
                return true;
            }
        }
        return false;
    }
}