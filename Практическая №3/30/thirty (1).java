import java.util.Scanner;

public class Thirty {
    
    public static void main(String[] args) {
        int numbers = new Thirty().userPutInt();
        int start = new Thirty().userPutStart();
        
        System.out.println("Результат работы: " + scriptMath(numbers, start));
    }
    
    private int userPutInt() {
        System.out.println("Введите длину ряда: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    private int userPutStart() {
        System.out.println("Введите стартовое число: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    private static String scriptMath(int numbers, int start) {
        int sum = 0;
        int number = numbers;
        
        String numberString = Integer.toString(start);
        int[] matrixStart = new int[numberString.length()];
        char[] charArray = numberString.toCharArray();

        String result = "";
        
        for (int i = 0; i < matrixStart.length; ++i) {
            matrixStart[i] = Character.getNumericValue(charArray[i]);
        }
        
        for (int i = 0; i < matrixStart.length; ++i) {
            sum += Math.pow(matrixStart[i], number);
            result += matrixStart[i] + "^" + number + (i+1 == matrixStart.length ? "" : "+");
            ++number;
        }
        
        if (sum == start * numbers) {
            return result + "=" + start + "*" + numbers;
        } else {
            return result + "=" + start + "*" + numbers;
        }
    }
    
}