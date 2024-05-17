import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();
        System.out.println(removeVowels(inputString));
    }
    
    public static String removeVowels(String inputString) {
        return inputString.replaceAll("[aeiouAEIOU]", "");
    }
}

