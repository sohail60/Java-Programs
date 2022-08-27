package com.company.Maths.Problems;

public class GPTerm {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        int n=5;
        double term=a;
        double r=b/a;

        int i=1;
        while (i<n){
            term=term*r;
            i++;
        }
        System.out.println((int)term);
    }
}
