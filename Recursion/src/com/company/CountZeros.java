package com.company;

public class CountZeros {
    public static void main(String[] args) {
        int n=10054;
        System.out.println(count(n,0));
    }

    static int count(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            c++;
        }
        return count(n/10,c);
    }
}