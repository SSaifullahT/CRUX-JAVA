package com.codingblocks.Lecture_9;

public class main {
    public static void main(String[] args) {
        //assign7q12("","1123");
        optimised(new StringBuilder(),"1123",0);
    }
    public static void assign7q12(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = (char)(unprocessed.charAt(0) - '0' + 'a' - 1);
        assign7q12(processed + ch , unprocessed.substring(1));
        if(unprocessed.length() >= 2){
            int num = Integer.parseInt(unprocessed.substring(0,2));
            if(num <= 26){
                ch = (char)('a' + num - 1);

                assign7q12(processed + ch , unprocessed.substring(2));
            }
        }
        if(unprocessed.startsWith("0")){
            return;
        }


    }

    public static void optimised(StringBuilder processed, String unprocessed, int index){
        if(index == unprocessed.length()){
            System.out.println(processed);
            return;
        }

        char ch =(char)(unprocessed.charAt(index) - '0' + 'a' - 1);

        processed.append(ch);
        optimised(processed,unprocessed,index + 1);
        processed.deleteCharAt(processed.length() - 1);

        if(index < unprocessed.length() - 1){
            ch =(char)(((unprocessed.charAt(index) - '0')* 10 + (unprocessed.charAt(index + 1) - '0' )+ 'a' - 1));

            processed.append(ch);
            optimised(processed,unprocessed,index + 2);
            processed.deleteCharAt(processed.length() - 1);

        }
    }
}
