import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int count = Math.max(num1, num2); 
        int start = Math.min(num1, num2);
        int step = start;
        for (int i = 0; i < count; i++) {
            System.out.print(start * start + " ");
            start += step;
        }
    }
}