import java.util.Scanner;
public class Solvingequations {
    public static void main(String[] args) {
        int a = 1, b = 0;
        int number = new Solvingequations().inputUser();
        int res = new Solvingequations().exit(number, a, b);
        System.out.println(res);
    }
    private int inputUser(){
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    private int exit (int number, int a, int b){
        if(number < 0) return b;
        else return ruleThreeFour(number, a, b);
    }
    private int ruleThreeFour(int number, int a, int b){
        if (number >= 0) {
            a = 2*number*a;
            b = (2*number + 1)*b;
            return exit(--number, b, a + b);
        } else return exit(number, b, a + b);
    }
}