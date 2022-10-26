package com.company;

public class Leetcode151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s.trim());
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if(sb.indexOf(" ")!=-1){
//                System.out.println("1 Running");
                reverseEachWord(sb,i,sb.indexOf(" ")-1);
                i=sb.indexOf(" ")+1;
            }
        }
        return sb.toString();
    }

    public static StringBuilder reverseEachWord(StringBuilder s,int start,int end){
//        System.out.println("2 Running");
        char temp;
        while(end>=start){
            temp=s.charAt(start);
            s.insert(start,s.charAt(end));
            s.insert(end,temp);
            start++;
            end--;
        }
//        System.out.println("3 Running");
        return s;
    }
}
