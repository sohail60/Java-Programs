package com.company;

public class Q25 {
    public static void main(String[] args) {
        String a="abcde";
        System.out.println(reverseString(a));
    }

    static String reverseString(String str) {
        StringBuilder s=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            s.append(str.charAt(i));
        }
        return s.toString();
    }
}
