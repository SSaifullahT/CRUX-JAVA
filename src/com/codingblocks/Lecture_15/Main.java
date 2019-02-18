package com.codingblocks.Lecture_15;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.insertFirst("Mohini");
        list.insertFirst("Shobhit");
        list.insertFirst("Monu");
        list.insertLast("Saif");
        list.insertIndex("Mohit", 2);
        list.insertIndex("Rahul",3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteIndex(2));
        list.display();
        list.diplaytail();
        list.reverse();
        list.display();
        list.diplaytail();
    }
}
