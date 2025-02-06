package LevelOne.ReID;

class Solution {
    private static StringBuilder primeString = new StringBuilder();
    private static int primeInteger = 1;

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; ++i)
            if (number % i == 0)
                return false;
        return true;
    }

    private static void addPrime() {
        do {
            primeInteger++;
        } while (!isPrime(primeInteger));
        primeString.append(primeInteger);

    }

    public static String solution(int n) {
        while (n + 5 > primeString.length())
            addPrime();
        return primeString.substring(n, n + 5);
    }

    public static void main(String[] args) {
        System.out.println(solution(0));
        System.out.println(solution(3));
    }
}