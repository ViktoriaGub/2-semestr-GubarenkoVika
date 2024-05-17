import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int startNum = scanner.nextInt();
        int stepNum = scanner.nextInt();
        int steps = scanner.nextInt();
        printSeries(startNum, stepNum, steps);

        scanner.close();
    }
    
    public static void printSeries(int startNum, int stepNum, int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.print(startNum + stepNum * i + " ");
        }
        System.out.println();
    }
}

