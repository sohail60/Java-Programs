package com.company.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s="sohail";
        System.out.println(palin(s));
    }

    public static boolean palin(String s){
        int start=0,end=s.length()-1;

        while (end>=start){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
