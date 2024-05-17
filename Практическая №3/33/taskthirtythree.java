import java.util.Scanner;

public class TaskThirtyThree {
    public static void main (String [] args){
        int number = new TaskThirtyThree().inputUser();
        System.out.println("Результат работы программы "+countSticks(number));
    }

    private int inputUser(){
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number >= 1 && number <= Math.pow(10, 18)) return number;
        else return 0;
    }

    private static int countSticks(int number){
        int res = 0;
        if (number % 2 == 0){
            System.out.println("Сколько взять: ");
            Scanner in = new Scanner(System.in);
            String howMuch = in.nextLine();
            if (howMuch.equalsIgnoreCase("Половину")) return number / 2;
            else return ++res;
        } else return ++res;

    }
}