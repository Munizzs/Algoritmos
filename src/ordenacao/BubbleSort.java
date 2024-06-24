package ordenacao;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(9,1,5,10,8,2,4,7,3,6);
        int[] numbersArray = {9,1,5,10,8,2,4,7,3,6};

        int[] sortNumbersArray = sort(numbersArray);
        List<Integer> sortNumbersList = sort(numbersList);

        for(int i : sortNumbersArray){
            System.out.println(i);
        }
        System.out.println();
        for(int i : sortNumbersList){
            System.out.println(i);
        }
    }

    private static int[] sort(int[]arr){
        for(int j = 0;j< arr.length;j++){
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temporary = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temporary;
                }
            }
        }
        return arr;
    }

    private static List<Integer> sort(List<Integer>arr){
        for(int j =0;j<arr.size()-1;j++){
            for(int i = 0;i<arr.size()-1;i++){
                if(arr.get(i)>arr.get(i+1)){
                    int temporary = arr.get(i);
                    arr.set(i,i+1);
                    arr.set(i+1,temporary);
                }
            }
        }
        return arr;
    }
}
