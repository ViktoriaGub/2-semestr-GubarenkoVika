import java.util.Arrays;
import java.util.Scanner;

public class ThirtyTwo {
    public static void main (String [] args){
        int index = new ThirtyTwo().inputUser();
        int resFibonacci = new ThirtyTwo().searchFibonacci(index);
        System.out.println(Arrays.toString(biggestCount(resFibonacci)));
    }

    private int inputUser(){
        System.out.println("Введите индекс: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private int searchFibonacci(int index){
        int work = 1, start = 1, res = 0;
        for (int i = 3; i < 10; ++i){
            res = work + start;
            start = work;
            work = res;
        }
        if (index >= 10 && index <= 100000){
            for (int i = 10; i < index; ++i){
                res = work + start;
                start = work;
                work = res;
                System.out.println(res);
            }
        } else System.out.println("Число должно быть от 10 до 100000");
        return res;
    }
    private static int[] biggestCount(int resFibonacci){
        String fibon = Integer.toString(resFibonacci);
        int count = 0, max = 0, number = 0, score = 0;
        for (int j = 0; j < fibon.length(); ++j){
            for (int i = 0; i < fibon.length(); ++i){
                if (fibon.charAt(j) == fibon.charAt(i)){
                    ++count;
                    if (count > score) {
                        number = Character.getNumericValue(fibon.charAt(i));
                        score = count;
                    }
                }
            }
            count = 0;
            if (score == 1) number = Math.max(Character.getNumericValue(fibon.charAt(j)), number);
        }
        return new int[]{score, number};
    }
}