package com.company.Permutation;

import java.util.ArrayList;

public class DiceRoll {
    public static void main(String[] args) {
        int num=4,face=6;
        viaPrinting("",num,face);
        ArrayList<String> answer= viaArraylist("",num,face);
        System.out.println(answer);
    }

    static void viaPrinting(String s,int n,int face){
        if(n==0){
            System.out.println(s);
            return;
        }

        for (int i = 1; i <=face && i<=n; i++) {
            viaPrinting(s+i,n-i,face);
        }
    }

    static ArrayList<String> viaArraylist(String s, int n, int face){
        if(n==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> answer=new ArrayList<>();
        for (int i = 1; i <=face && i<=n; i++) {
            answer.addAll(viaArraylist(s+i,n-i,face));
        }
        return answer;
    }
}