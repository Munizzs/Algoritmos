package ordenacao;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {
        int [] ArrayNumbers = {9,61,50,10,8,22,4,17,3,1};
        List<Integer> listNumbers = Arrays.asList(9,61,50,10,8,22,4,17,3,62);

        int[] ArrayNumbersSort = sort(ArrayNumbers);
        List<Integer> listNumbersSort = sort(listNumbers);

        for(int i : ArrayNumbersSort)
            System.out.println(i);

        System.out.println();

        for(int i : listNumbersSort)
            System.out.println(i);
    }

    private static int[] sort(int[]arr){
        for(int j=0;j<arr.length-1;j++){
            for(int i =j+1;i<arr.length;i++){
                if (arr[j] > arr[i]) {
                    int temporary = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temporary;
                }
            }
        }
        return arr;
    }

    private static List<Integer> sort(List<Integer>arr){
        for(int j=0;j<arr.size()-1;j++){
            for(int i=j+1;i<arr.size()-1;i++){
                if(arr.get(j)>arr.get(i)){
                    int temporary = arr.get(j);
                    arr.set(j,arr.get(i));
                    arr.set(i,temporary);
                }
            }
        }
        return arr;
    }
}
