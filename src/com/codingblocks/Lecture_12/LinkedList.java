package com.codingblocks.Lecture_12;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(String value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.value + ", ");
            node = node.next;
        }
        System.out.println("END \b");
    }

    public void insertLast(String value){
        if(size == 0){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public String deleteFirst()throws Exception{
        if(size == 0){
            throw new Exception("Removing from empty list");
        }
        String value = head.value;
        head = head.next;
        if(head == null){
            tail = head;
        }
        size--;
        return value;
    }

    public String deleteLast() throws Exception{
        if(size < 2){
            return deleteFirst();
        }
        String vlaue = tail.value;

        Node node = head;
        while (node.next != tail){

            node = node.next;
        }
        node.next = null;
        node = tail;
        size--;
        return vlaue;
    }

    public String get(int index) throws Exception{
        if(index < 0 || index >= size){
            throw new Exception("Index out of Bond");
        }
        Node node = head;

        for (int i = 0; i < index ; i++) {
            node = node.next;
        }

        return node.value;
    }

    private Node getNode(int index) throws Exception{
        if(index < 0 || index >= size){
            throw new Exception("Index out of Bond");
        }
        Node node = head;

        for (int i = 0; i < index ; i++) {
            node = node.next;
        }

        return node;
    }

    public void insert(int index, String value)throws Exception{
        if(index < 0 || index > size){
            throw new Exception("Index out of Bond");
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node prev = getNode(index - 1);
        Node node = new Node(value, prev.next);
        prev.next = node;
        size++;
    }

    public String delete(int index) throws Exception{
        if(index < 0 || index >= size){
            throw new Exception("Index out of Bond");
        }
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prev = getNode(index - 1);
        String value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    private class Node{
        private String value;
        private Node next;

        public Node(String value){
            this.value = value;
        }

        public Node(String value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
