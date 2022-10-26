package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode989 {
    public static void main(String[] args) {
        int[]  num = {6};
        int k = 809;
        System.out.println(addToArrayForm(num,k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int d=(int)(Math.log10(k))+1;
        int n=num.length,i=0,last=0,digit=0,carry=0;

        while(n>0){
            last=k%10;
            k=k/10;
            digit=last+num[num.length-1-i]+carry;
            i++;
            if(digit>=10){
                list.add(0,digit%10);
                carry=digit/10;
            } else {
                list.add(0,digit);
                carry=0;
            }
            n--;
        }
        while (k>0){
            last=k%10;
            k=k/10;
            list.add(0,last+carry);
        }

        if(carry!=0){
            list.add(0,carry);
        }
        return list;
    }
}