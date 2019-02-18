package com.codingblocks.Lecture_8;

public class Queens {
    public static void main(String[] args) {
        int n = 5;

        boolean[][] board = new boolean[n][n];
        nqueen(board,0);
        System.out.println(nqueencount(board,0));
    }
    public static void nqueen(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return;
        }
        for (int col = 0; col < board.length ; col++) {
            if(isSafe(board, row,col)){
                board[row][col] = true;
                nqueen(board, row+1);
                board[row][col] = false;
            }
        }
    }
    public static int nqueencount(boolean[][] board, int row){
        if(row == board.length){
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length ; col++) {
            if(isSafe(board, row,col)){
                board[row][col] = true;
                count += nqueencount(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        int i;
        int j;
        //for up
        for (i = row - 1; i >= 0 ; i--) {
            if(board[i][col]){
                return false;
            }
        }
        int min = Math.min(row,col);
        for (i= 1; i <= min; i++) {
            if(board[row - i][col - i]){
                return false;
            }
        }

        for (i = row - 1,j = col + 1; i >= 0 && j < board.length ; i--,j++) {
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    public static void display(boolean[][] board){
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                if(board[i][j]){
                    System.out.print("Q" +" ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }


}
