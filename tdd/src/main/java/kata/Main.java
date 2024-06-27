package kata;

public class Main {
    public static String convert(int number) {
        StringBuilder result = new StringBuilder();
        while (number >= 1) {
            result.append("I");
            number -= 1;
        }
        if (number >= 4) {
            result.append("IV");
            number -= 4;
        }
        if (number >= 5) {
            result.append("V");
            number -= 5;
        }

        return result.toString();
    }
}
