import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        // сортировка слиянием для примера
        int[] array = {5, 3, 2, 4, 1};
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortArray(int[] array) {
        if (array.length > 1) {
            int[] arrayB = new int[array.length / 2];
            System.arraycopy(array, 0, arrayB, 0, array.length / 2);

            int[] arrayC = new int[array.length - arrayB.length];
            System.arraycopy(array, arrayB.length, arrayC, 0, array.length - arrayB.length);

            sortArray(arrayB);
            sortArray(arrayC);
            mergeArray(array, arrayB, arrayC);
        }
    }

    static void mergeArray(int[] array, int[] arrayB, int[] arrayC) {
        int counterB = 0;
        int counterC = 0;

        for (int i = 0; i < array.length; i++) {
            if (counterB == arrayB.length) {
                array[i] = arrayC[counterC];
                counterC++;
            } else if (counterC == arrayC.length) {
                array[i] = arrayB[counterB];
                counterC++;
            } else if (arrayB[counterB] < arrayC[counterC]) {
                array[i] = arrayB[counterB];
                counterB++;
            } else {
                array[i] = arrayC[counterC];
                counterC++;
            }
        }
    }
}
