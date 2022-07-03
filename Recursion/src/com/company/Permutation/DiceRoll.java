package com.company.Permutation;

public class DicePrint {
    public static void main(String[] args) {
        int num=4;
        diceRoll("",num);
    }

    static void diceRoll(String s,int n){
        if(n==0){
            System.out.println(s);
            return;
        }

        for (int i = 1; i <=6 && i<=n; i++) {
        diceRoll(s+i,n-i);
        }
    }
}