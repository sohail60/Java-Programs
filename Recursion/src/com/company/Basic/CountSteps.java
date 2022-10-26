package com.company;

//  Calc no of steps taken to reduce the number to 0

public class CountSteps {
    public static void main(String[] args) {
        int n=54;
        System.out.println(count(n));
    }

    static int count(int n){
        return helper(n, 0);
    }

    static int helper(int n , int steps){
        if(n==0){
            return steps;
        }

        if(n%2==0){
            steps++;
            return helper(n/2,steps);
        }
            steps++;
            return helper((n-1),steps);
    }
}