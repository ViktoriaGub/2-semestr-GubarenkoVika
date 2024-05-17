import java.util.Arrays;
import java.util.Scanner;

public class ThirtySi {
    public static void main(String[] args){
        String line = new ThirtySi().userPutString();
        String wordKey = new ThirtySi().userPutStringKey();
        char[] matrixWords = new ThirtySi().matrixWords();
        System.out.println("Результат работы: " + сaesarsСipher(line, wordKey, matrixWords));
    }

    private String userPutString(){
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private String userPutStringKey(){
        System.out.println("Введите слово ключ: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private char[] matrixWords(){
        int j = 0;
        char[] matrixWords = new char[32];
        for (char i = 'а'; i <= 'я'; ++i){
            matrixWords[j] = i;
            ++j;
        }System.out.println(Arrays.toString(matrixWords));
        return matrixWords;
    }

    private static StringBuilder сaesarsСipher(String line, String wordKey, char[] matrixWords){
        StringBuilder result = new StringBuilder(" ");
        int k = 0, c = 0, shift = 0;
        for (int j = 0; j < wordKey.length(); ++j) {
            for (int i = 0; i < matrixWords.length; ++i) {
                if(wordKey.charAt(j) == matrixWords[i]) k = i;
                if(line.charAt(j) == matrixWords[i]) c = i;
                shift = c-k;
                System.out.println(shift);
            }
        }

        if (shift > 0){
            for (int j = 0; j < line.length(); ++j) {
                for (int i = matrixWords.length - 1; i >= 0; --i) {
                    if (i - shift < 0 && matrixWords[i] == line.charAt(j)) result.append(matrixWords[matrixWords.length - shift + i]);
                    if (matrixWords[i] == line.charAt(j) && i - shift >= 0) result.append(matrixWords[i - shift]);
                }
                if (line.charAt(j) == ' ') result.append(line.charAt(j));
            }
        } else{
            for (int j = 0; j < line.length(); ++j) {
                for (int i = 0; i < matrixWords.length; ++i) {
                    if (matrixWords[i] == line.charAt(j) && i - shift < matrixWords.length) result.append(matrixWords[i - shift]);
                    if (i - shift >= matrixWords.length && matrixWords[i] == line.charAt(j)) result.append(matrixWords[- shift + i - matrixWords.length]);
                }
                if (line.charAt(j) == ' ') result.append(line.charAt(j));
            }
        }
        return result;
    }
}