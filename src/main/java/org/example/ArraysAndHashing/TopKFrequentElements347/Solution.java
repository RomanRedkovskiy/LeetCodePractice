package org.example.ArraysAndHashing.TopKFrequentElements347;

import java.util.*;

public class Solution {

    static class Pair implements Comparable<Pair> {
        private final Integer number;
        private final Integer frequency;

        public Pair(Integer number, Integer frequency) {
            this.number = number;
            this.frequency = frequency;
        }

        public Integer getNumber() {
            return number;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(other.frequency, this.frequency);
        }
    }


    public static void main(String[] args) {
        for (int i : topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2)) {
            System.out.print(i + " ");
        }
    }

    // Map<Number, Frequency>: insertion using map for speed reasons
    // Queueing pairs into Priority Queue because other solutions are slow
    // Overriding compareTo and implementing Comparable<Pair> to allow use Pair with PriorityQueue
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        PriorityQueue<Pair> queuePairs = new PriorityQueue<>();
        int[] ans = new int[k];
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mapPair: frequencyMap.entrySet()){
            queuePairs.add(new Pair(mapPair.getKey(), mapPair.getValue()));
        }
        for (int i = 0; i < k; i++) {
            ans[i] = Objects.requireNonNull(queuePairs.poll()).getNumber();
        }
        return ans;
    }
}
