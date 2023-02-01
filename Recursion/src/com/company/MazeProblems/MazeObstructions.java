package com.company.MazeProblems;

import java.util.ArrayList;

public class MazeObstructions {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        booleanMatrix("",maze,0,0);
//        allDirectionsBooleanMatrix("",maze,0,0);
//        System.out.println(pathObstacleDiagonal("",3,3));
    }

    static void booleanMatrix(String str, boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(str);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if(r<maze.length-1){
            booleanMatrix(str+"D",maze,r+1,c);
        }

        if(c<maze[0].length-1){
            booleanMatrix(str+"R",maze,r,c+1);
        }

        if(r<maze.length-1 && c<maze[0].length-1){
            booleanMatrix(str+"d",maze,r+1,c+1);
        }
    }

    static void allDirectionsBooleanMatrix(String str,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(str);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c]=!maze[r][c];

        if(r<maze.length-1){
            allDirectionsBooleanMatrix(str+"D",maze,r+1,c);
        }

        if(c<maze[0].length-1){
            allDirectionsBooleanMatrix(str+"R",maze,r,c+1);
        }

        if(r>0){
            allDirectionsBooleanMatrix(str+"U",maze,r-1,c);
        }

        if(c>0){
            allDirectionsBooleanMatrix(str+"L",maze,r,c-1);
        }

        maze[r][c]=!maze[r][c];
    }

    static ArrayList<String> pathObstacle(String str, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(str);
            return list;
        }

        ArrayList<String> result=new ArrayList<>();

        if(row>1){
            if(row!=2 || col!=2){
            result.addAll(pathObstacle(str+"D",row-1,col));
            }
        }

        if(col>1){
            if(row!=2 || col!=2){
            result.addAll(pathObstacle(str+"R",row,col-1));
            }
        }

        return result;
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