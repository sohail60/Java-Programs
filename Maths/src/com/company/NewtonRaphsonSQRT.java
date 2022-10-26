package com.company;

public class NewtonRaphsonSQRT {
    public static void main(String[] args) {

    }

    public static double newtonRaphsonsqrt(double n){
        double x=n;
        double root;

        while (true){
            root=0.5*(x+ (n/x));

            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
}
