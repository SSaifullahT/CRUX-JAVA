package com.codingblocks.Lecture_10;

public class Stack {

    protected int[] data;
    private int top;

    private final static int DEFAULT_CAPACITY = 10;

    public Stack(){
        this.data = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public Stack(int size){
        this.data = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return  this.top == -1;
    }

    public boolean isFull(){
        return this.top == this.data.length - 1;
    }

    public void push(int item){
        if(!this.isFull()) {
            //this.top++;
            this.data[++top] = item;
        }else {
            System.out.println("Stack is already full");
        }
    }

    public int pop() throws  Exception{
        if(!this.isEmpty()){
            return this.data[top--];
        }
        //if empty then it has to return int
        throw new Exception("Bhag yaha se");
    }

    public void display(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("End");
    }
}
