package ordenacao;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrayNumbers = {76, 12, 93, 13, 51, 28};
        List<Integer> listNumbers = Arrays.asList(76, 12, 93, 13, 51, 28);

        int[] arrayNumbersSort = sort(arrayNumbers);
        List<Integer> listNumbersSort = sort(listNumbers);

        for(int a : arrayNumbersSort){
            System.out.println(a);
        }

        System.out.println();

        for(int a : listNumbersSort){
            System.out.println(a);
        }
    }

    private static int[] sort(int[] arr){
        for(int j = 1;j<arr.length;j++){
            for(int i = 0;i<j;i++){
                if(arr[j]<arr[i]){
                    int temporary = arr[i];
                    arr[i] = arr[j];
                    for(int y = j;y>i;y--){
                        arr[y] = arr[y-1];
                    }
                    arr[i+1] = temporary;
                }
            }
        }
        return arr;
    }

    private static List<Integer> sort(List<Integer> arr){
        for(int j = 1;j<arr.size();j++){
            for(int i = 0;i<j;i++){
                if(arr.get(j)<arr.get(i)){
                    int temporary = arr.get(i);
                    arr.set(i,arr.get(j));
                    for(int y = j;y>i;y--){
                        arr.set(y,arr.get(y-1));
                    }
                    arr.set(i+1,temporary);
                }
            }
        }
        return arr;
    }
}
