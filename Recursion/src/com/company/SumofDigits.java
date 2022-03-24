package com.company;

public class SumofDigits {
    public static void main(String[] args) {
        int n=234567;
        int sum=sum(n,0);
        System.out.println(sum);
    }

    static int sum(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=sum+(n%10);

        sum=sum(n/10,sum);
        return sum;
    }
}
