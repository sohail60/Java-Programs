package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=in.nextInt();

        boolean ans=evenorodd(n);
        if(ans)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    static boolean evenorodd(int n)
    {if (n%2==0) {
        return true;
    }
        return false;
    }

    /*   static boolean evenorodd(int n)
         {return n%2==0;
         }
         THIS WILL RETURN TRUE OR FALSE AND THAT WILL GET STORED IN ans VARIABLE
    */

}
