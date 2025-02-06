package LevelOne.MinionWorkAssignments;

import java.util.*;

class Solution {
    public static Object[] solution(int[] assignments, int limit) {
        // Key --> ID | Value --> Count
        Map<Integer, Integer> countIDs = new HashMap<>();
        for (int assignment : assignments)
            countIDs.put(assignment, countIDs.getOrDefault(assignment, 0) + 1);

        List<Integer> finalList = new LinkedList<>();
        for (int assignment : countIDs.keySet())
            if (countIDs.get(assignment) <= limit)
                finalList.add(assignment);
        return finalList.toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, 0)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 2, 3, 3, 3, 4, 5, 5}, 1)));
    }
}