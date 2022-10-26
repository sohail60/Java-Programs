package com.company;

import java.util.Arrays;

public class Leetcode1304 {
    public static void main(String[] args) {
        int[] digits = {9};
        int[] answer=plusOne(digits);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] plusOne(int[] digits) {
        int length=digits.length;
        while(length>0){
            if(digits[length-1] != 9){
                digits[length-1]=digits[length-1]+1;
                break;
            } else {
                digits[length-1]=0;
                length--;
                if(length==0){
                    int[] result=new int[digits.length+1];
                    result[0]=1;
                    for(int i=1;i<result.length;i++){
                        result[i]=digits[i-1];
                    }
                    return result;
                }
            }
        }
        return digits;
    }
}
