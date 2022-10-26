package com.company.MazeProblems;

import java.util.ArrayList;

public class MazeDiagonal {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> pathAnswer=pathDiagonal("",n,n);
        System.out.println(pathAnswer);
        int noOfWaysAnswer=noOfWaysDiagonal(n,n);
        System.out.println(noOfWaysAnswer);
    }

    static ArrayList<String> pathDiagonal(String str,int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(str);
            return list;
        }

        ArrayList<String> left=new ArrayList<>();
        ArrayList<String> right=new ArrayList<>();
        ArrayList<String> centre=new ArrayList<>();

        if(row>=1 && col>=1){
            left.addAll(pathDiagonal(str+"D",row-1,col));
            right.addAll(pathDiagonal(str+"R",row,col-1));
            centre.addAll(pathDiagonal(str+"dg",row-1,col-1));
        }
        left.addAll(right);
        left.addAll(centre);
        return left;
    }

    static int noOfWaysDiagonal(int row,int col){
        if(row== 1 || col==1){
            return 1;
        }
        int count=0;
        if(row>=1 && col>=1){
            count=count+noOfWaysDiagonal(row-1,col);
            count=count+noOfWaysDiagonal(row,col-1);
            count=count+noOfWaysDiagonal(row-1,col-1);
        }
        return count;
    }
}