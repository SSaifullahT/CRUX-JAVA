package com.codingblocks.Lecture_15;

import java.util.Stack;

public class GenericLinkedList<T extends Comparable<T>> {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(T value) {
        Node node = new Node(value, head);
        head = node;

        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void insertLast(T value) {
        Node node = new Node(value);
        if (size == 0) {
//            tail = node;
//            head = node;
            insertFirst(value);
            return;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public T deleteFirst() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is empty");
        }
        T value = head.value;

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
        return value;
    }

    public T deleteLast() throws Exception {
        if (size <= 1) {
            return deleteFirst();
        }
        T value = tail.value;
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
        tail = node;
        return value;
    }

    public void insertIndex(T value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        Node prev = get(index - 1);
        Node node = new Node(value, prev.next);

        prev.next = node;
        size++;
    }

    public T deleteIndex(int index) throws Exception {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node pev = get(index - 1);

        T value = pev.next.value;

        pev.next = pev.next.next;

        size--;
        return value;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void reverse() {
        if (size < 2) {
            return;
        }
      //  reverse(head);
        Node prev = null;
        Node present = head;
        Node next = head.next;
        tail = head;
        while (present != null){
            present.next = prev;

            prev = present;
            present = next;

            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    public void diplaytail() {
        System.out.println(tail.value);
    }

    private void reverse(Node node) {
        if (node.next == null) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

    }


    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println("END");
    }

    public GenericLinkedList<T> merge(GenericLinkedList<T> second){
        GenericLinkedList<T> list = new GenericLinkedList<>();

        Node f_node = this.head;
        Node s_node = second.head;

        while (f_node != null && s_node != null){
            if(f_node.value.compareTo(s_node.value) < 0){
                list.insertLast(f_node.value);
                f_node = f_node.next;
            }
            else {
                list.insertLast(s_node.value);
                s_node = s_node.next;
            }
        }
        while (f_node !=  null){
            list.insertLast(f_node.value);
            f_node = f_node.next;
        }
        while (s_node !=  null){
            list.insertLast(s_node.value);
            s_node = s_node.next;
        }
        return list;
    }

    public void kreverse(int k){
//        Node t_head = null;
//        Node t_tail = null;

        GenericLinkedList<T> temp = new GenericLinkedList<>();

        Node node = head;

        Stack<Node> stack = new Stack<>();
        while (node != null) {

            for (int i = 0; i < k && node != null; i++) {
                 stack.push(node);
                 node = node.next;
            }

            while (!stack.empty()){
                Node top = stack.pop();

//                if(t_head == null){
//                    t_head = top;
//                    t_tail = top;
//                }else {
//                    t_tail.next = top;
//                    t_tail = top;
//                }
//
//                t_tail = null;
                temp.insertLast(top.value);

            }
            head = temp.head;
            tail = temp.tail;
        }
    }

    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
