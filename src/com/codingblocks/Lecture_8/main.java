package com.codingblocks.Lecture_8;

import java.lang.ref.SoftReference;

// Sum of integer input in a string
public class main {
    public static void main(String[] args) {
        System.out.println(String_Sum("2234",0));
        String num = "2245";
        System.out.println(to_Int(num, num.length() -1));
        duplicates("","helloo");
        StringBuilder arr = new StringBuilder();
        System.out.println(dubBuilder(arr,"helllo",0));
        StringBuilder str1 = new StringBuilder("abba");
        StringBuilder str2 = new StringBuilder("cbc");
        System.out.println(stringcompare(str1,str2,0));
        System.out.println(palindromeString(str1,(str1.length() - 1) / 2));
        StringBuilder list = new StringBuilder();
        System.out.println(duplicateRemove(list,"hello",0));
        StringBuilder line = new StringBuilder();
        System.out.println(removeX(line,"axbcdxbvnhxj",0,0));
        System.out.println(countHI("abchihgfhishdn",0,0));
        StringBuilder a = new StringBuilder();
        System.out.println(removeHI(a,"abdhikjg",0));
        StringBuilder b = new StringBuilder();
        System.out.println(replaceHI(b,"abdhikjg",0));
        System.out.println(countHIwithException("abchihgfhitshdn",0,0));
        System.out.println(countTwin("axaxaba",0,0));
        StringBuilder c = new StringBuilder();
        System.out.println(Parentresis(c,"ihg(abc)fhd",0));
        //StringBuilder d = new StringBuilder();
        //possibleCode("","1123");

    }
    public static int String_Sum(String list, int index){
        if(index == list.length()){
            return 0;
        }
        int a = (list.charAt(index) - '0');
        return a + String_Sum(list,index + 1);

    }
    public static int to_Int(String list, int index){
        if(index == 0){
            return list.charAt(index) - '0';
        }
        int digit = (list.charAt(index) - '0');
        return digit + 10 * to_Int(list,index - 1);

    }
    public static void duplicates(String processed, String unprocessed){
        if(unprocessed.length() < 2){
            System.out.println(processed + unprocessed);
            return;
        }
        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        if(unprocessed.charAt(0) == first){
            duplicates(processed + first +"*", unprocessed);
        } else{
            duplicates(processed + first, unprocessed);
        }

    }
    public static StringBuilder dubBuilder(StringBuilder processed, String unprocessed, int index){
       if(index == unprocessed.length()){
           return processed;
       }
       if(index == unprocessed.length() - 1){
           return processed.append(unprocessed.charAt(index));
       }

       char first = unprocessed.charAt(index);

       processed.append(first);

       if(first == unprocessed.charAt(index + 1)){
           processed.append("*");
       }
       return dubBuilder(processed, unprocessed, index + 1);
    }

    public static boolean stringcompare(StringBuilder str1, StringBuilder str2, int index){
        if(str1.length() != str2.length()){
            return false;
        }
        if(index == str1.length() / 2){
            return true;
        }
        char first = str1.charAt(index);
        char last = str1.charAt(str1.length() - 1 - index);
        str1.setCharAt(index,last);
        str1.setCharAt(str1.length() - 1 - index, first);
        if(str1.charAt(index) == str2.charAt(index) && str1.charAt(str1.length() - 1- index) == str2.charAt(str2.length() - 1 - index)){
            return stringcompare(str1,str2,index + 1);
        }
        return  false;
    }

    public static boolean palindromeString(StringBuilder str1, int index){
        if(index < 0){
            return true;
        }
        if(str1.charAt(index) == str1.charAt(str1.length() - 1 - index)){
            return palindromeString(str1,index - 1);
        }
        return false;
    }

    public static StringBuilder duplicateRemove(StringBuilder process, String unprocess, int index){
        if(index == unprocess.length() - 1){
            return process.append(unprocess.substring(index));
        }
        char first = unprocess.charAt(index);
        if(first == unprocess.charAt(index + 1)){
            return duplicateRemove(process,unprocess,index + 1);
        }
        process.append(first);

        return duplicateRemove(process,unprocess,index + 1);

    }

    public static StringBuilder removeX(StringBuilder process, String unprocess, int index, int count){
        if(index == unprocess.length()){
            for (int i = 0; i < count ; i++) {
                process.append("x");
            }
            return process;
        }

        char first = unprocess.charAt(index);
        if(first == 'x'){
            return removeX(process,unprocess,index + 1,count + 1);

        }
        process.append(first);
        return removeX(process,unprocess,index + 1,count);
    }

    public static int countHI(String list, int index, int count){
        if(index >= list.length() - 1){
            return count;
        }
        char first = list.charAt(index);
        char second = list.charAt(index + 1);

        if(first == 'h' && second == 'i'){
            return countHI(list,index + 2,count + 1);
        }
        return countHI(list,index + 1,count);
    }

    public static StringBuilder removeHI(StringBuilder process, String unprocess, int index){
        if(index == unprocess.length() - 1){
            return process;
        }

        char first = unprocess.charAt(index);
        char second = unprocess.charAt(index + 1);
        if(first == 'h' && second == 'i'){
            return removeHI(process,unprocess,index + 1);

        }
        process.append(first);

        return removeHI(process,unprocess,index + 1);
    }

    public static StringBuilder replaceHI(StringBuilder process, String unprocess, int index){
        if(index == unprocess.length() - 1){
            return process;
        }

        char first = unprocess.charAt(index);
        char second = unprocess.charAt(index + 1);
        if(first == 'h' && second == 'i'){
            process.append("bye");
            return replaceHI(process,unprocess,index + 1);

        }
        process.append(first);

        return replaceHI(process,unprocess,index + 1);
    }

    public static int countHIwithException(String list, int index, int count){
        if(index == list.length() - 2){
            return count;
        }
        char first = list.charAt(index);
        char second = list.charAt(index + 1);
        char third = list.charAt(index + 2);
        if(first == 'h' && second == 'i'){
            if(third == 't'){
                return countHIwithException(list,index + 1,count);
            }
            return countHIwithException(list,index + 1,count + 1);
        }
        return countHIwithException(list,index + 1,count);
    }
    public static int countTwin(String list, int index,int count){
        if(index == list.length() - 2){
            return count;
        }
        int first = list.charAt(index);
        int second = list.charAt(index + 2);
        if(first == second){
            return countTwin(list,index + 1, count + 1);
        }
        return countTwin(list,index + 1, count);
    }

    public static StringBuilder Parentresis(StringBuilder process,String unprocess, int index){
        if(index == unprocess.length()){
            return process;
        }
        if(unprocess.charAt(index) == '('){
            index++;
            while (index < unprocess.length() && unprocess.charAt(index) != ')'){
                char first = unprocess.charAt(index);
                process.append(first);
                index++;
            }
        }
        return Parentresis(process,unprocess,index + 1);
    }

}


