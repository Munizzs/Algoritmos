package ordenacao;

import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arrayNumbers = {74,16,2,38,76};
        List<Integer> listNumbers = Arrays.asList(74,16,2,38,76);

        int[] arrayNumbersList = sort(arrayNumbers);
        List<Integer> listNumbersSort = sort(listNumbers);

        for(int a : arrayNumbersList){
            System.out.println(a);
        }

        System.out.println();

        for(int a : listNumbersSort){
            System.out.println(a);
        }
    }

    private static int[] sort(int[] arr){
        int pivo = 4;
        int min = arr[pivo];
        for(int j = 0;j<arr.length;j++){
            for (int i = pivo+1; i < arr.length; i++) {
                if (arr[pivo] > arr[i]) {
                    min = arr[i];
                    int temporary = arr[pivo];
                    arr[pivo] = min;
                    arr[i] = temporary;
                    pivo = i;
                }
            }

            int max = arr[pivo];
            for (int i = pivo-1; i >= 0; i--) {
                if (arr[pivo] < arr[i]) {
                    max = arr[i];
                    int temporary = arr[pivo];
                    arr[pivo] = max;
                    arr[i] = temporary;
                    pivo = i;
                }
            }
        }
        return arr;
    }

    private static List<Integer> sort(List<Integer> arr){

        return arr;
    }
}
