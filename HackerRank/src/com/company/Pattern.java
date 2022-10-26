package com.company;

//https://www.hackerrank.com/challenges/printing-pattern-2/problem

//                                    4 4 4 4 4 4 4
//                                    4 3 3 3 3 3 4
//                                    4 3 2 2 2 3 4
//                                    4 3 2 1 2 3 4
//                                    4 3 2 2 2 3 4
//                                    4 3 3 3 3 3 4
//                                    4 4 4 4 4 4 4

public class Pattern {
    public static void main(String[] args) {
    int n=4,c=1;
        for (int i = n; i >=1 ; i--) {
            int counter=0;
            for (int j = n; j >=i; j--) {
                System.out.print(j + " ");
                counter++;
            }

            while(counter<(2*n-1)-c){
                System.out.print(i+" ");
                counter++;
            }

            for (int j = i; j <=n ; j++) {
                if (j==1){
                    continue;
                }
                System.out.print(j+" ");
                counter++;
            }
            c++;
            System.out.println();
            }

        c=1;
        for (int i = 2; i <=n ; i++) {
            int counter=0;
            for (int j = n; j >=i; j--) {
                System.out.print(j + " ");
                counter++;
            }

            while(counter<(2*n-1)-c){
                System.out.print(i+" ");
                counter++;
            }

            for (int j = i; j <=n ; j++) {
                if (j==1){
                    continue;
                }
                System.out.print(j+" ");
                counter++;
            }
            c++;
            System.out.println();
        }
        }
    }