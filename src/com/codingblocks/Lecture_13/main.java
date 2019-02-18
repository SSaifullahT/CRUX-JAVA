package com.codingblocks.Lecture_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception{

        Exception e = new Exception("No element found");

        CustomException ex = new CustomException("No item found yet");

        File f = new File("hello.txt");
        try{
            Scanner s = new Scanner(f);
        }
        catch (ArithmeticException exc){
            System.out.println("Ja math padh ke aa");
        }
        catch (FileNotFoundException fnot){
            f.createNewFile();
        }
        catch (Exception exc){
            System.out.println(exc.getMessage());
        }
    }
}
