package com.dsa.algo;

import java.util.Arrays;

public class InsertionSortingAlgo {
    public static void main(String[] args) {
        int [] arr = {89,76,45,67,88};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int [] arr){
        for(int i =1;i<arr.length;i++){
            for(int j =0 ;j<i;j++){

                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
    }
}
