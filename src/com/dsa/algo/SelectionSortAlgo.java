package com.dsa.algo;

import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {

        int [] arr = {7,4,804,8,9,99,108};
         selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIdx = arr.length-i-1;
            int maxIdx = getMaxIdx(arr,0,lastIdx);
            swapping(arr,lastIdx,maxIdx);

        }
    }
    static int getMaxIdx(int[] arr,int start,int end){
        int maxIdx=start;
        for (int i = start; i <= end ; i++) {
            if(arr[i]> arr[maxIdx]){
                maxIdx =i;
            }

        }
        return maxIdx;

    }
    static void swapping(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
