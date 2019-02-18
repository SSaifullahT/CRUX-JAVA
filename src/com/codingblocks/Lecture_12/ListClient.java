package com.codingblocks.Lecture_12;

public class ListClient {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.insertFirst("Mohit");
        list.insertFirst("Mohini");
        list.display();
        list.insert(1,"Ritu");
        list.insert(3,"Neha");
        //list.delete(1);
        //list.deleteLast();
        list.insertLast("Rahul");
        list.display();
    }
}
