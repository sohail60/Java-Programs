package com.company.Maths.Problems;

import java.util.ArrayList;

public class QuadEqnRoots {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> roots(int a, int b,int c){
        ArrayList<Integer> list=new ArrayList<>();
        int d=b*b-4*a*c;

        if(d<0){
            return new ArrayList<>();
        }

        int x1 = -b + (int) Math.sqrt(d);
        list.add(x1);
        int x2 = -b - (int) Math.sqrt(d);
        list.add(x2);
        return list;
    }

}
