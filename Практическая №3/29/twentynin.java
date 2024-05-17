import java.util.Scanner;

public class TwentyNin {
    public static void main(String[] args){
        int number = new TwentyNin().userPutInt();
        System.out.println("Результат работы: " + differenceSquare(number));
    }

    private int userPutInt(){
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static String differenceSquare (int number){
        int a = 0, b = 0;
        for (int i = 1; i <= 100000; ++i){
            if (i*i - ((i - 1)*(i - 1)) == number) {;
                a = i*i;
                b = ((i - 1)*(i - 1));
            }
        } return number + "=" + a + "-" + b;
    }
}