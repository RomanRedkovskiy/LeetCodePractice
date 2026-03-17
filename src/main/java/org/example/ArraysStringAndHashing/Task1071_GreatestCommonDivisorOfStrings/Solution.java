package org.example.ArraysStringAndHashing.Task1071_GreatestCommonDivisorOfStrings;

class Solution {

    public static void main( String[] args) {
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder prefix = new StringBuilder();
        String lastSucceedPrefix = "";
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            boolean lastStepSucceed = true;
            prefix.append(str1.charAt(i));
            int maxStrLength = Math.max(str1.length(), str2.length());
            for (int j = 0; j < maxStrLength; j++) {
                char c = prefix.charAt(j % prefix.length());
                if ((j < str1.length() && c != str1.charAt(j)) || (j < str2.length() && c != str2.charAt(j))) {
                    lastStepSucceed = false;
                }
                if (j + 1 == maxStrLength && (str1.length() % prefix.length() != 0 || str2.length() % prefix.length() != 0)) {
                    lastStepSucceed = false;
                }
            }
            if (lastStepSucceed) {
                lastSucceedPrefix = prefix.toString();
            }
        }
        return lastSucceedPrefix;
    }
}