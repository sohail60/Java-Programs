package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={-100,-98,-1,2,3,4};
        int ans=product(arr);
        System.out.println(ans);
    }

    static int product(int[] arr){
        int prod1=1,prod2=1;
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }

        for (int i=arr.length-1;i>arr.length-4;i--){
            prod1=prod1*arr[i];
        }
        for (int i=0;i<3;i++){
            prod2=prod2*arr[i];
        }

        return Math.max(prod1,prod2);
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}