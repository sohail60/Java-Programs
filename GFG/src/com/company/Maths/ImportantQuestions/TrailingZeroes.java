package com.company.Maths.ImportantQuestions;


// A number is given as input. We have to find the trailing zeroes of its factorial.

public class TrailingZeroes {
    public static void main(String[] args) {
        int n=15;
        int answer=countTrailingZeroes1(n);
        System.out.println(answer);
    }

    public static int countTrailingZeroes1(int n){
        int fact=factorial(n);
        int d=0,c=0;

        while(fact>0){
            d=fact%10;

            if(d==0){
                c++;
            } else {
                break;
            }
            fact=fact/10;
        }
        return c;
    }

    public static int factorial(int n){
        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        return fact;
    }

    public static int countTrailingZeroes2(int n){
        int result=0;

        for (int i = 5; i <=n ; i=i*5) {
            result=result+n/i;
        }
        return result;
    }
}