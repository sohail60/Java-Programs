package com.company.Recursion.Problems;

public class DigitalRoot {
    public static void main(String[] args) {
        int n=936;
        int sum=sum(n,0);
        System.out.println(sum);
    }

    static int sum(int n,int sum){
        if(n==0){
            if (sum>=10){
                n=sum;
                sum=0;
            } else {
            return sum;
            }
        }
        sum=sum+(n%10);

        sum=sum(n/10,sum);
        if(sum>=10){
            sum(sum,0);
        }
        return sum;
    }
}