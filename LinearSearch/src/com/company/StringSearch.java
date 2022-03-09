package com.company;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=in.next();
        System.out.println("Enter the Character");
        char ch=in.next().trim().charAt(0);
        boolean ans=search(str,ch);

        if(ans){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }

    static boolean search(String str,char ch){
        if (str.length() == 0) {
            return false;
        }
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)==ch){
               return true;
           }
        }
        return false;
    }
}