import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Быстрая сортировка для примера
        int[] array = {8, 5, 6, 2, 7};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    static void quickSort(int[] array, int beginning, int ending) {
        if (beginning < ending) {
            int pivot = partition(array, beginning, ending);
            quickSort(array, beginning, pivot - 1);
            quickSort(array, pivot + 1, ending);
        }
    }

    static int partition(int[] array, int beginning, int ending) {
        int counter = beginning;
        int pivot = ending;

        for (int i = beginning; i < ending; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[i];
                array[i] = array[counter];
                array[counter] = temp;
                counter++;
            }
        }

        int temp = array[counter];
        array[counter] = array[pivot];
        array[pivot] = temp;
        return counter;
    }
}
