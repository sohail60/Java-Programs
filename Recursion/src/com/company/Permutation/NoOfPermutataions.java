package com.company.Permutation;

import java.util.ArrayList;

public class NumberOfPermutataions {
    public static void main(String[] args) {
        String s="abc";
        int answer=permutation("",s);
        System.out.println(answer);
    }

    static int permutation(String updated, String initial){

        if(initial.isEmpty()){
            return 1;
        }

        char ch=initial.charAt(0);
        int count=0;

        for (int i = 0; i < updated.length()+1; i++) {
            String first=updated.substring(0,i);
            String second=updated.substring(i,updated.length());
            count=count+permutation(first+ch+second,initial.substring(1));
        }
        return count;
    }
}
