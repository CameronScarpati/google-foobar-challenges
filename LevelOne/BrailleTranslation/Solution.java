package LevelOne.BrailleTranslation;

import java.util.Map;

class Solution {
    private static final Map<Character, String> BRAILLE_MAP = Map.ofEntries(
            Map.entry('a', "100000"),
            Map.entry('b', "101000"),
            Map.entry('c', "100100"),
            Map.entry('d', "100110"),
            Map.entry('e', "100010"),
            Map.entry('f', "110100"),
            Map.entry('g', "110110"),
            Map.entry('h', "110010"),
            Map.entry('i', "010100"),
            Map.entry('j', "010110"),
            Map.entry('k', "101000"),
            Map.entry('l', "111000"),
            Map.entry('m', "101100"),
            Map.entry('n', "101110"),
            Map.entry('o', "101010"),
            Map.entry('p', "111100"),
            Map.entry('q', "111110"),
            Map.entry('r', "111010"),
            Map.entry('s', "011100"),
            Map.entry('t', "011110"),
            Map.entry('u', "101001"),
            Map.entry('v', "111001"),
            Map.entry('w', "010111"),
            Map.entry('x', "101101"),
            Map.entry('y', "101111"),
            Map.entry('z', "101011")
    );

    private static String charToBraille(char c) {
        return BRAILLE_MAP.getOrDefault(c, "000000");
    }

    public static String solution(String toTranslate) {
        StringBuilder braille = new StringBuilder();

        for (char c : toTranslate.toCharArray()) {
            if (!Character.isLetter(c)) {
                braille.append("000000");
                continue;
            } else if (Character.isUpperCase(c)) {
                braille.append("000001");
                c = Character.toLowerCase(c);
            }
            braille.append(charToBraille(c));
        }
        return braille.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("code"));
        System.out.println(solution("Braille"));
        System.out.println(solution("The quick brown fox jumps over the lazy dog"));
    }
}