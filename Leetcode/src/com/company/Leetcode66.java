package com.company;

public class Leetcode66 {
    public int[] plusOne(int[] digits) {
        int length=digits.length;
        while(length>=0){
            if(digits[length-1] != 9){
            digits[length-1]=digits[length-1]+1;
            break;
            } else {
                digits[length-1]=0;
                length--;
            }
        }
        return digits;
    }
}