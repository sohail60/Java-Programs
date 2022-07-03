package com.company.MazeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Maze3x3 {
    public static void main(String[] args) {
        String s="RRDD";
        List<String> answer=permutation("",s);
        System.out.println(answer);
    }

    static List<String> permutation(String updated, String initial){
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
        List<String> UniqueNumbers=answer.stream().distinct().collect(Collectors.toList());
        return UniqueNumbers;
    }
}