import java.util.ArrayList;

public class ThirtyOne {
    public static void main(String[] args){
        int kilometers = 175;
        ArrayList<Integer> arrayCity = new ArrayList<>();
        arrayCity.add(50);
        arrayCity.add(55);
        arrayCity.add(57);
        arrayCity.add(58);
         arrayCity.add(60);
        System.out.println("Результат работы: " + chooseBestSum(kilometers, arrayCity));
    }

    private static int chooseBestSum(int kilometers, ArrayList<Integer> arrayCity) {
        ArrayList<ArrayList<Integer>> cityCombinations = new ArrayList<>();
        for (int i = 0; i < arrayCity.size(); i++) {
            for (int j = i + 1; j < arrayCity.size(); j++) {
                for (int k = j + 1; k < arrayCity.size(); k++) {
                    ArrayList<Integer> combination = new ArrayList<>();
                    combination.add(arrayCity.get(i));
                    combination.add(arrayCity.get(j));
                    combination.add(arrayCity.get(k));
                    cityCombinations.add(combination);
                }
            }
        }
        int result = 0;
        for (ArrayList<Integer> combination : cityCombinations) {
            int sum = combination.stream().mapToInt(Integer::intValue).sum();
            if (sum <= kilometers) result = sum;

        } return result;
    }
}