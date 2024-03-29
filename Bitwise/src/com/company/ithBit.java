package com.company;

public class ithBit {
    public static void main(String[] args) {
        int n=0,i=5;
        boolean ans1=get(n,i);
        int ans2=set(n,i);
        int ans3=clear(n,i);
        int ans4=firstSet(n);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(ans4);
    }

    static boolean get(int n,int i){
        int mask=1<<(i-1);          // we are considering the right most digit to be of index 0
        return ((n&mask)!=0);
        // Return true if the bit is set otherwise return false
    }

    static int set(int n,int i){
        int mask=1<<(i-1);
        return (n|mask);
    }

    static int clear(int n,int i){
        int mask=~(1<<(i-1));
        return (n&mask);
    }

    static int firstSet(int n){
        return n&(-n);
    }
}