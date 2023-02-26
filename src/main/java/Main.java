import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Сортировка пузырьком для примера
        int[] array = {8, 5, 6, 4, 2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
