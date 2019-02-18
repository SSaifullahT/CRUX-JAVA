package com.codingblocks.Lecture_15;

public class GenericMain {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list = new GenericLinkedList<>();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.display();

        GenericLinkedList<Integer> list2 = new GenericLinkedList<>();
        list2.insertFirst(4);
        list2.insertFirst(0);
        list2.insertLast(5);
        list2.display();

        GenericLinkedList<Integer> list3 = list.merge(list2);
        list3.display();

        list3.kreverse(3);
        list3.display();


    }
}
