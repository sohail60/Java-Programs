package com.company;

public class Even {
    public static void main(String[] args) {
        int[] arr={2,45,9,18,36,745,5};
        int ans=even(arr);
        System.out.println("Answer="+ans);
    }

    static int even(int[] nums){
            int a=0,c1=0,c2=0;
            for(int i=0;i<nums.length;i++){
                a=nums[i];
                c1=0;
                while(a>0){
                    c1++;
                    a=a/10;
                }
                if(c1%2==0){
                    c2++;
                }
            }
            return c2;
        }
    }