package com.dsa.algo;

import java.util.Arrays;

public class BubbleSortingAlgo {

    public static void main(String[] args) {
     int [] arr = {77,88,33,99,78};
     bubbleSortAlgo(arr);
     System.out.print(Arrays.toString(arr));
    }

    public static void bubbleSortAlgo(int[] arr){
        boolean swapped;

        for(int i =0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){

                if(arr[j]< arr[j-1]){

                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
//                    arr[j] = arr[j] + arr[j-1];
//                    arr[j-1]=arr[j] - arr[j-1];
//                    arr[j] = arr[j] - arr[j-1];
                    swapped = true;
                }
            }
            if(!swapped)
                break;

        }

    }
}
