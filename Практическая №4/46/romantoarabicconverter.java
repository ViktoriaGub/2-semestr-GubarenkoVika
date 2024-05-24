import java.util.HashMap;
import java.util.Scanner;

public class RomanToArabicConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год римскими цифрами:  ");
        String romanNumber = in.nextLine();
        int arabicNumber = convertRomanToArabic(romanNumber);
        System.out.println("Римское число " + romanNumber + " в арабском формате: " + arabicNumber);
    }

    public static int convertRomanToArabic(String romanNumber) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(romanNumber.charAt(i));
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
        }

        return result;
    }
}