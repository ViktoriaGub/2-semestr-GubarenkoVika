import java.util.Scanner;

public class ThirtyNine {
    public static void main (String[] args){
        System.out.println(changeText() + " ауч");
    }
    private String inputStr(){
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static String changeText(){
        String inputStr = new ThirtyNine().inputStr();
        char work = ' ';
        String str = "";
        for (int i = 0; i < inputStr.length(); ++i){
            if (i == 0) {
                work = inputStr.charAt(0);
                ++i;
            }

            if(inputStr.charAt(i) == ' '){
                str += work;
                str += inputStr.charAt(i);
                work = inputStr.charAt(i + 1);
                i += 2;
            }
            str += inputStr.charAt(i);
        }
        str += work;
        return str;
    }
}