package com.company.Maths.ImportantQuestions;

import java.util.ArrayList;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(primeList(13));
    }

    public static void primeFactors(int n){
        ArrayList<Integer> list= primeList(n);

        for (int i = 0; i < list.size(); i++) {
            while(n%list.get(i)==0){
                System.out.print(list.get(i)+" ");
                n=n/list.get(i);
            }
        }
    }

    public static ArrayList<Integer> primeList(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i%j!=0){
                    list.add(i);
                }
            }
        }
        return list;
    }
}