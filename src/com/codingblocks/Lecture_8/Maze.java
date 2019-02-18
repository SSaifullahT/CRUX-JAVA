package com.codingblocks.Lecture_8;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze(5,4));
        System.out.println(maze1(5,4));
        //mazePath("",3,3);
        StringBuilder arr =new StringBuilder();
       // mazePathBuilder(arr,3,3);
        ArrayList<String> brr = new ArrayList<>();
        System.out.println(mazeReturn(brr,"",3,3));

    }
    public static int maze(int row, int col){
        if(row == 1||col == 1){
            return 1;
        }
        return maze((row-1), col) + maze(row, col - 1);

    }
    public static int maze1(int row, int col){
        if(row == 1 && col == 1){
            return 1;
        }
        int count = 0;
        if(row > 1){
        count += maze((row-1), col);
        }
        if(col > 1){
        count += maze(row, col - 1);
        }
        return count;
    }
    public static void mazePath(String path, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if(row > 1){
            mazePath(path+"v",row-1,col);
        }
        if(col > 1){
            mazePath(path +"h",row,col -1);
        }
    }
    public static void mazePathBuilder(StringBuilder path, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }
        if(row > 1){
            path.append("v");
            mazePathBuilder(path,row -1,col);
            path.deleteCharAt(path.length() - 1);
        }
        if(col > 1){
            path.append("h");
            mazePathBuilder(path,row,col-1);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static ArrayList<String> mazeReturn(ArrayList<String> brr, String path, int row, int col){
        if(row == 1 && col == 1){
            brr.add(path);
            return brr;
        }

        if(row > 1){
            mazeReturn(brr,path+"v",row-1, col);
        }
        if(col > 1){
            mazeReturn(brr,path +"h",row,col -1);
        }
        return brr;
    }


}
