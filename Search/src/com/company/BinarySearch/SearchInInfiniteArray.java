package com.company;
// Infinite Array means we will not use length function
public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target=10;
        int ans=range( arr, target);
        System.out.println(ans);
    }

    static int range(int[] arr,int target){
        int start=0,end=1,newstart;
        while (target>arr[end]){
            newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return search( arr, target, start, end);
    }

    static int search(int[] arr,int target,int start, int end){
        while(end>=start){
            int mid=start+(end-start)/2;
            if (target < arr[mid]) {
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}