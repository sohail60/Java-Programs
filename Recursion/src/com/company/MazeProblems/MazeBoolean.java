package com.company.MazeProblems;

import java.lang.reflect.Array;

public class MazeBoolean {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        obstruction("",maze,0,0);
        allDirections("",maze,0,0);
    }

    static void obstruction(String str, boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(str);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if(r<maze.length-1){
            obstruction(str+"D",maze,r+1,c);
        }

        if(c<maze[0].length-1){
            obstruction(str+"R",maze,r,c+1);
        }
    }

    static void allDirections(String str,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(str);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c]=!maze[r][c];

        if(r<maze.length-1){
            allDirections(str+"D",maze,r+1,c);
        }

        if(c<maze[0].length-1){
            allDirections(str+"R",maze,r,c+1);
        }

        if(r>0){
            allDirections(str+"U",maze,r-1,c);
        }

        if(c>0){
            allDirections(str+"L",maze,r,c-1);
        }

        maze[r][c]=!maze[r][c];
    }
}