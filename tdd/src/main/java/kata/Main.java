package kata;

public class Main {
    private static final int[] VALUES = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < VALUES.length; i++) {
            while (number >= VALUES[i]) {
                result.append(SYMBOLS[i]);
                number -= VALUES[i];
            }
        }

        return result.toString();
    }
}
