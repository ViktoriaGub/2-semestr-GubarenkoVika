import java.util.Arrays;
import java.util.Scanner;

public class ThirtyEven {
    public static void main(String[] args){
        System.out.println(solvingNumbers());
    }

    private String userPutString(){
        System.out.println("Введите строку из 4 чисел: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static int [] collectingArray(){
        String userPut = new ThirtyEven().userPutString();
        int[] arrayСomparison = new int[4];
        for (int i = 0; i < arrayСomparison.length; ++i){
            arrayСomparison[i] = Character.getNumericValue(userPut.charAt(i));
        }
        System.out.println(Arrays.toString(arrayСomparison));
        return arrayСomparison;
    }

    private int[] makeNumber(){
        int[] arrayMake = new int[4];
        for (int i = 0; i < arrayMake.length; i++) {
            arrayMake[i] = ((int) (Math.random() * 10));
        }
        return arrayMake;
    }
    private static String solvingNumbers(){
        int[] arrayСomparison = collectingArray();
        int count = 0, index = 20;
        String result = "";
        int[] arrayMake = new TaskThirtySeven().makeNumber();

        for (int i = 0; i < index; ++i) {
            for (int j = 0; j < arrayMake.length; ++j) {
                if (arrayMake[j] == arrayСomparison[j]) ++count;
                }
            if (count == 4) {
                index = 0;
                System.out.println("Вы отгадали");
                result = Arrays.toString(arrayСomparison);
            }
            else {
                result = "Вы постратили все 20 попыток";
                System.out.println("Вы не отгадали, попробуйте еще раз количество совпадений: " + count);
                arrayСomparison = collectingArray();
            }
            count = 0;
        }
        return result;
    }
}