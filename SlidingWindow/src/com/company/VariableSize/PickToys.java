package com.company.VariableSize;

import java.util.HashMap;

public class PickToys {
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(pickToys(arr));
    }

    static int pickToys(int[] arr){
        int n=arr.length;
        int i=0,j=0,count=0,max=-1;
        int k=2;
        HashMap<Integer,Integer> map=new HashMap<>();
        if(n==0 || n==1 || n==2){
            return n;
        }
        while (j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            count=map.size();
            if(count<k){
                max=Math.max(max,j-i+1);
                j++;
            } else if(count==k){
                max=Math.max(max,j-i+1);
                j++;
            } else if(count>k){
                while(count>k){
                    map.put(arr[i],map.get(arr[i])-1);
                    if(map.get(arr[i])==0){
                        map.remove(arr[i]);
                    }
                    count=map.size();
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
