import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку символов:");
        String firstString = scanner.nextLine();
        System.out.println("Введите вторую строку символов:");
        String secondString = scanner.nextLine();
        System.out.println(checkEnding(firstString, secondString));
    }
    
    public static boolean checkEnding(String firstString, String secondString) {
        return firstString.endsWith(secondString);
    }
}

