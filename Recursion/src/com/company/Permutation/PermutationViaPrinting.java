package com.company.Permutation;

public class PermutationViaPrinting {
    public static void main(String[] args) {
        String s="abc";
        helper(s);
    }
    static void helper(String s){
        permutation("",s);
    }

    static void permutation(String updated,String initial){

        if(initial.isEmpty()){
            System.out.println(updated);
            return;
        }

        char ch=initial.charAt(0);

        for (int i = 0; i < updated.length()+1; i++) {
            String first=updated.substring(0,i);
            String second=updated.substring(i,updated.length());
            permutation(first+ch+second,initial.substring(1));
        }
    }
}