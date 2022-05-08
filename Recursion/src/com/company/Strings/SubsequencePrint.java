package com.company.Strings;

public class SubsequencePrint {
    public static void main(String[] args) {
        String s="abc";
        subseq(s);
    }

    static void subseq(String s){
        helper(s,"");
    }

    static void helper(String initial,String updated){
        if(initial.isEmpty()){
            System.out.println(updated);
            return;
        }

        helper(initial.substring(1), updated+initial.charAt(0));
        helper(initial.substring(1), updated);
    }
}
