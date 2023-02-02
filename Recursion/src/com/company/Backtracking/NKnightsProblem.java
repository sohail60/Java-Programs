package com.company.Backtracking;

public class NKnightsProblem {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board=new boolean[n][n];
        nKnight(board,0);
    }

    static void nKnight(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                nKnight(board,row+1);
                board[row][col]=false;
            }
        }
    }

    static boolean isSafe(boolean[][] board,int r,int c){
        if(isValid(board,r-2,c+1)){
            if(board[r-2][c+1]){
            return false;
            }
        }
        if(isValid(board,r-2,c-1)){
            if (board[r-2][c-1]){
            return false;
            }
        }
        if(isValid(board,r-1,c+2)){
            if (board[r-1][c+2]){
                return false;
            }
        }
        if(isValid(board,r-1,c-2)){
            if (board[r-1][c-2]){
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board,int r,int c){
        if(r>=0 && r<board.length && c >= 0 && c < board.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
