package com.company.Backtracking;

import java.util.ArrayList;

public class NQueenArrayList {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(nQueen(board,0));
    }

    static ArrayList<ArrayList<Integer>> nQueen(boolean[][] board,int row){
        if(row==board.length){
            ArrayList<ArrayList<Integer>> list=new ArrayList<>();
            list.add(print(board));
            return list;
        }

        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                result.addAll(nQueen(board,row+1));
                board[row][col]=false;
            }
        }
        return result;
    }

    static boolean isSafe(boolean[][] board,int r,int c){
        for (int i = 0; i < r; i++) {
            if(board[i][c]){
                return false;
            }
        }

        int maxLeft=Math.min(r,c);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[r-i][c-i]){
                return false;
            }
        }

        int maxRight=Math.min(r,board.length-c-1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> print(boolean[][] board){
        ArrayList<Integer> list=new ArrayList<>();
        for (boolean[] row : board){
            for(int col=0;col<row.length;col++){
                if(row[col]){
                    list.add(col+1);
                }
            }
        }
        return list;
    }
}
