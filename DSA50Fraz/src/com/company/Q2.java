package com.company;

public class Q2 {
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        int profit=profit(arr);
        System.out.println(profit);
    }

    static int profit(int[] arr){
    int min=min(arr);
    if(min==arr.length-1){
        return 0;
    }
    int max=max(arr,min+1);
    return arr[max]-arr[min];
    }

    static int min(int[] arr){
        int min=arr[0],minIndex=0;
        for (int i = 0; i <=arr.length-1 ; i++) {
            if (arr[i]< min){
                min=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }

    static int max(int[] arr,int start){
        int max=arr[start],maxIndex=start;
        for (int i = start; i <=arr.length-1 ; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
        }
    }