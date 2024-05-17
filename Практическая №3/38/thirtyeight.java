import java.util.ArrayList;
import java.util.Scanner;

public class ThirtyEight {
    public static void main(String[] args){
        System.out.println(everyThree());
    }

    private ArrayList<Integer> userArray(){
        System.out.println("Введите количество участников: ");
        Scanner in = new Scanner(System.in);
        int longArray = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(longArray);
        for (int i = 0; i < longArray; ++i){
            list.add(i, i+1);
        }
        System.out.println(list);
        return list;
    }

    private int userPutStart(){
        System.out.println("Введите номер первого учасника: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static String everyThree(){
        ArrayList<Integer> userArray = new ThirtyEight().userArray();
        int userPutStart = new ThirtyEight().userPutStart();
        ArrayList<Integer> copyArray =new ArrayList<>();
        int count = userArray.size(), winner = 0;
        for (int j = 0; j < count; ++j){
            for (int i = 0; i < count; ++i){
                if (i == userPutStart - 1){
                    copyArray.add(userArray.get(i));
                    userArray.remove(i);
                    System.out.println(userArray + " результат " + copyArray);
                    userPutStart += 2;
                }

                if (userPutStart > userArray.size()) {
                    userPutStart = userArray.size() - userPutStart + i;
                    }
                if (userPutStart < 0) {
                    userPutStart = userArray.size() - 1;
                    }
                if (userPutStart == 0) userPutStart = userArray.size();
            }
        }
        return copyArray.get(copyArray.size()-1) + " победил. Результат: " + copyArray;
    }
}