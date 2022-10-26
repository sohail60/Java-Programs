package com.company.MazeProblems;

import java.util.ArrayList;

public class MazeObstacle {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> pathAnswer=pathObstacle("",n,n);
        System.out.println(pathAnswer);
        ArrayList<String> pathAnswer2=pathObstacleDiagonal("",n,n);
        System.out.println(pathAnswer2);
    }

    static ArrayList<String> pathObstacle(String str,int row, int col){
        if(row==2 && col==2){
            ArrayList<String> list2=new ArrayList<>();
            return list2;
        }

        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(str);
            return list;
        }

        ArrayList<String> left=new ArrayList<>();
        ArrayList<String> right=new ArrayList<>();

        if(row>=1 && col>=1){
            left.addAll(pathObstacle(str+"D",row-1,col));
            right.addAll(pathObstacle(str+"R",row,col-1));
        }

        left.addAll(right);
        return left;
    }

    static ArrayList<String> pathObstacleDiagonal(String str,int row, int col){
        if(row==2 && col==2){
            ArrayList<String> list2=new ArrayList<>();
            return list2;
        }

        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(str);
            return list;
        }

        ArrayList<String> left=new ArrayList<>();
        ArrayList<String> right=new ArrayList<>();
        ArrayList<String> centre=new ArrayList<>();

        if(row>=1 && col>=1){
            left.addAll(pathObstacleDiagonal(str+"D",row-1,col));
            right.addAll(pathObstacleDiagonal(str+"R",row,col-1));
            centre.addAll(pathObstacleDiagonal(str+"dg",row-1,col-1));
        }

        left.addAll(right);
        left.addAll(centre);
        return left;
    }
}