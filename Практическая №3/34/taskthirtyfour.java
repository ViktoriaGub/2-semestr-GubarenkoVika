import java.util.Scanner;

public class TaskThirtyFour {
    public static void main (String [] args){
        int number = new TaskThirtyFour().inputUser();
        System.out.println("У Тани будет "+countSticks(number));
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
            if (howMuch.equalsIgnoreCase("Половину")) return ++res;
            else return number/2;
        } else {--number;
            return number/2;
        }

    }
}