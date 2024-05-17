import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2.
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        greet(name);

    }

    // 2
    public static void greet(String name) {
        String firstLetter = name.substring(0, 1).toUpperCase();
        String rest = name.substring(1).toLowerCase();
        System.out.println("Привет, " + firstLetter + rest + "!");
    }

}
