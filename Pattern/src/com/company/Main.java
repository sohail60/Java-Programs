package com.company;

public class Main {

    public static void main(String[] args) {
	int n=6;
    int s=sum(n);
        System.out.println("Sum="+s);
    }



   static int term(int n){
        if(n==1){
            return 1;
        }
        return term(n-1)+(n-1);
    }


    static int sum(int n){
        if(n==1){
            return 1;
        }
        return term(n)+sum(n-1);
    }
}