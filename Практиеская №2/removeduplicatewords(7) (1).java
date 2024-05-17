import java.util.*;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с повторяющимися словами: ");
        String input = sc.nextLine();
        
        String[] words = input.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        
        StringBuilder result = new StringBuilder();
        for (String word : uniqueWords) {
            result.append(word).append(" ");
        }
        
        System.out.println("String with duplicates removed: " + result.toString().trim());
    }
}