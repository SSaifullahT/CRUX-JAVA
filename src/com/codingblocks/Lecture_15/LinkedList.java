package com.codingblocks.Lecture_15;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(String value) {
        Node node = new Node(value, head);
        head = node;

        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void insertLast(String value) {
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

    public String deleteFirst() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is empty");
        }
        String value = head.value;
        head = head.next;
        if (size == 1) {
            tail = null;
        }
        size--;
        return value;
    }

    public String deleteLast() throws Exception {
        if (size <= 1) {
            return deleteFirst();
        }
        String value = tail.value;
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
        tail = node;
        return value;
    }

    public void insertIndex(String value, int index) {
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

    public String deleteIndex(int index) throws Exception {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node pev = get(index - 1);

        String value = pev.next.value;

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

    private class Node {
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
