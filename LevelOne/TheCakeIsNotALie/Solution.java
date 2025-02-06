package LevelOne.TheCakeIsNotALie;

class Solution {
    private static boolean evenParts(String cakeEdge, int partition) {
        String partitionStr = cakeEdge.substring(0, partition);
        for (int i = partition; i < cakeEdge.length(); i += partition) {
            if (!cakeEdge.substring(i, i + partition).equals(partitionStr))
                return false;
        }
        return true;
    }

    public static int solution(String cakeEdge) {
        int maxCount = 1;
        for (int i = cakeEdge.length(); i > 0; --i) {
            if (cakeEdge.length() % i == 0
                    && evenParts(cakeEdge, (cakeEdge.length() / i))) {
                maxCount = i;
                break;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcabcabc"));
        System.out.println(solution("abccbaabccba"));
    }
}