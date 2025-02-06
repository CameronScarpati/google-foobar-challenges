package LevelOne.SkippingWork;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int solution(int[] x, int[] y) {
        if (x.length > y.length) {
            int[] tmp = x;
            x = y;
            y = tmp;
        }

        Set<Integer> allIDs = new HashSet<>();
        for (int i : x)
            allIDs.add(i);

        for (int i : y)
            if (!allIDs.contains(i)) return i;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{13, 5, 6, 2, 5}, new int[]{5, 2, 5, 13}));
        System.out.println(solution(new int[]{14, 27, 1, 4, 2, 50, 3, 1}, new int[]{2, 4, -4, 3, 1, 1, 14, 27, 50}));
    }
}