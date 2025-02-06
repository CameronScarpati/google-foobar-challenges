package LevelOne.ILoveLanceJanice;

class Solution {
    private static final char[] backwardsAlphabet = new char[]{'z', 'y', 'x', 'w', 'v', 'u', 't',
                                                               's', 'r', 'q', 'p', 'o', 'n', 'm',
                                                               'l', 'k', 'j', 'i', 'h', 'g', 'f',
                                                               'e', 'd', 'c', 'b', 'a'};

    public static String solution(String code) {
        StringBuilder decode = new StringBuilder();

        for (char c : code.toCharArray()) {
            if (Character.isLetter(c) && !Character.isUpperCase(c)) {
                decode.append(backwardsAlphabet[c - 'a']);
            } else
                decode.append(c);
        }

        return decode.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("wrw blf hvv ozhg mrtsg'h vkrhlwv?"));
        System.out.println(solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));
    }
}