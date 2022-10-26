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

        ArrayList<String> left=new ArrayList<>();
        ArrayList<String> right=new ArrayList<>();

        if(row>=1 && col>=1){
        left.addAll(path(str+"D",row-1,col));
        right.addAll(path(str+"R",row,col-1));
        }

        left.addAll(right);
        return left;
    }

    static int noOfWays(int row,int col){
        if(row== 1 || col==1){
            return 1;
        }

        int count=0;
        if(row>=1 && col>=1){
            count=count+noOfWays(row-1,col);
            count=count+noOfWays(row,col-1);
        }
        return count;
    }
}