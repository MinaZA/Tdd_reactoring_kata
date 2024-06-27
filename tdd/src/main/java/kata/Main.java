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

        return result.toString();
    }
}
