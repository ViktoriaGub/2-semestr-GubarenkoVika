import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static int[] snail(int[][] array) {
        int[] result = new int[array.length * array[0].length];
        int index = 0;
        
        int topRow = 0;
        int bottomRow = array.length - 1;
        int leftColumn = 0;
        int rightColumn = array[0].length - 1;
        
        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            for (int i = leftColumn; i <= rightColumn; i++) {
                result[index++] = array[topRow][i]; 
            }
            topRow++;
            
            for (int i = topRow; i <= bottomRow; i++) {
                result[index++] = array[i][rightColumn]; 
            }
            rightColumn--;
            
            if (topRow <= bottomRow) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    result[index++] = array[bottomRow][i]; // Нижняя строка
                }
                bottomRow--;
            }
            
            if (leftColumn <= rightColumn) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result[index++] = array[i][leftColumn]; // Левый столбец
                }
                leftColumn++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] snailArray = snail(array);
        
        for (int num : snailArray) {
            System.out.print(num + " ");
        }
    }
}