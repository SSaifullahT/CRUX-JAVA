package com.codingblocks.Lecture_11;

public class QueueOptimized extends Queue{
    private int[] data;
    private int end;
    private int front;

    private static final int DEFAULT_SIZE = 10;

    public QueueOptimized() {
        this.front = 0;
        this.end = -1;
        this.data = new int[DEFAULT_SIZE];
    }

    public QueueOptimized(int size){
        this.front = 0;
        this.end = -1;
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return this.end == -1;
    }

    public boolean isFull(){
        return this.end == this.data.length - 1;
    }

    public void insert(int item){
        if(!isFull()){
            this.data[++this.end] = item;
        }
    }

    public int delete() throws Exception{
        if(!this.isEmpty()){

            return data[this.front++];
        }
        throw new Exception("Queue is empty");
    }
    public void display(){
        for (int i = front; i <= end ; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("End");
    }
}
