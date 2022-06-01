package com.company.Permutation;

import java.util.ArrayList;

public class PermutationViaArrayList {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> answer=permutation("",s);
        System.out.println(answer);
    }

    static ArrayList<String> permutation(String updated, String initial){

        if(initial.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(updated);
            return list;
        }

        ArrayList<String> answer=new ArrayList<>();
        char ch=initial.charAt(0);

        for (int i = 0; i < updated.length()+1; i++) {
            String first=updated.substring(0,i);
            String second=updated.substring(i,updated.length());
            answer.addAll(permutation(first+ch+second,initial.substring(1)));
        }
        return answer;
    }
}