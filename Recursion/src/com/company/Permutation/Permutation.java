package com.company.Permutation;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String s="abc";
        viaPrinting("",s);
        ArrayList<String> answer=viaArraylist("",s);
        System.out.println(answer);
    }

    static void viaPrinting(String updated,String initial){
        if(initial.isEmpty()){
            System.out.println(updated);
            return;
        }

        char ch=initial.charAt(0);

        for (int i = 0; i < updated.length()+1; i++) {
            String first=updated.substring(0,i);
            String second=updated.substring(i,updated.length());
            viaPrinting(first+ch+second,initial.substring(1));
        }
    }

    static ArrayList<String> viaArraylist(String updated, String initial){
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
            answer.addAll(viaArraylist(first+ch+second,initial.substring(1)));
        }
        return answer;
    }
}