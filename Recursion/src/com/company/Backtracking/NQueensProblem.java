package com.company.Backtracking;

public class NQueensProblem {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        nQueen(board,0);
    }

    static void nQueen(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                nQueen(board,row+1);
                board[row][col]=false;
            }
        }
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


    static void display(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
