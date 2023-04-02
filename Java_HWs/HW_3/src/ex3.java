/*Реализовать алгоритм сортировки слиянием*/
//
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args){
        int[] array = new int[] {2,5,8,1,3,4,23,25,0,4,7,9};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] sortedArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                sortedArray[k] = leftArray[i];
                i++;
            } else {
                sortedArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Если в одном из массивов остались элементы, добавляем их в конец сортированного массива
        while (i < leftLength) {
            sortedArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            sortedArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] array) {
        int arrLength = array.length;
        if (arrLength < 2) {
            return;
        }

        int mid = arrLength / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arrLength - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        for (int i = mid; i < arrLength; i++) {
            rightArray[i - mid] = array[i];
        }
//      сортировка каждого подмассива
            mergeSort(leftArray);
            mergeSort(rightArray);
//      слияние подмассивов
            merge(leftArray, rightArray, array);
    }
}






