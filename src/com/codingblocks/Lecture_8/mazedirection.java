package com.codingblocks.Lecture_8;

public class mazedirection {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;

        boolean[][] maze = new boolean[m][n];

        maze("",maze,0,0);
    }
    public static void maze(String path,boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(path);
            return;
        }

        if(maze[row][col]){
            return;
        }
        maze[row][col] = true;

        if(row > 0){
            maze(path+"u",maze,row - 1,col);
        }

        if(col > 0){
            maze(path + "l",maze,row,col - 1);
        }
        if(row < maze.length - 1){
            maze(path+"d",maze,row + 1,col);

        }
        if(col < maze[0].length - 1){
            maze(path + "r",maze,row,col + 1);

        }

        maze[row][col] = false;
    }
}
