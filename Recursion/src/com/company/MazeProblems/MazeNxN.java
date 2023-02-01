package com.company.MazeProblems;

import java.util.ArrayList;

public class MazeNxN {
    public static void main(String[] args) {
    int n=3;
        ArrayList<String> pathAnswer=path("",n,n);
        System.out.println(pathAnswer);
        int noOfWaysAnswer=noOfWays(n,n);
        System.out.println(noOfWaysAnswer);

    }

    static ArrayList<String> path(String str,int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(str);
            return list;
        }

        ArrayList<String> result=new ArrayList<>();

        if(row>1){
            result.addAll(path(str+"D",row-1,col));
        }

        if(col>1){
            result.addAll(path(str+"R",row,col-1));
        }

        return result;
    }

    static int noOfWays(int row,int col){
        if(row==1 || col==1){       // We can give && also, but we r giving || bcoz whenever we reach the
            return 1;               // last row or column then 1 answer is guaranteed.
        }

        int count=0;

        if(row>1){
            count=count+noOfWays(row-1,col);
        }

        if(col>1){
            count=count+noOfWays(row,col-1);
        }
        return count;
    }
}