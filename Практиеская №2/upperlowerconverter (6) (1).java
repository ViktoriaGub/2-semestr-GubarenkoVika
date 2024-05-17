import java.util.Scanner;

public class UpperLowerConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку символов: ");
        String input = sc.nextLine();

        String result = convertCase(input);
        System.out.println("Результат преобразования: " + result);
    }

    public static String convertCase(String input) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }

        if (uppercaseCount > lowercaseCount) {
            return input.toUpperCase();
        } else if (lowercaseCount > uppercaseCount) {
            return input.toLowerCase();
        } else {
            return input.toLowerCase();
        }
    }
}