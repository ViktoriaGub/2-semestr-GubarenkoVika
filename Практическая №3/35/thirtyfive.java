import java.util.Arrays;
import java.util.Scanner;

public class ThirtyFive { 
    public static void main (String [] args){
        String[] inputMass = new ThirtyFive().inputMass();
        System.out.println(Arrays.toString(lingMass(inputMass)));
    }
    private String[] inputMass(){
        System.out.println("Введите длину массива: ");
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();

        System.out.println("Введите числа в массив: ");
        Scanner in = new Scanner(System.in);

        String[] arrayMass = new String[a];
        for (int i = 0; i < a; ++i){
            arrayMass[i] = in.nextLine();
        }
        return arrayMass;
    }
    private static String[] lingMass(String[] inputMass){

        int check = 0, flag = 0;

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < inputMass.length - 1; i++) {
                for (int j = i + 1; j < inputMass.length; j++) {
                    for (int k = 0; k < inputMass[i].length(); ++k) {
                        check += Character.getNumericValue(inputMass[i].charAt(k));
                    }
                    for (int c = 0; c < inputMass[j].length(); ++c) {
                        flag += Character.getNumericValue(inputMass[j].charAt(c));
                    }
                    if (check >= flag) {
                        String str = inputMass[i];
                        inputMass[i] = inputMass[j];
                        inputMass[j] = str;
                        needIteration = true;
                    }
                }
                check = 0;
                flag = 0;
            }
        }
        return  inputMass;
    }
}