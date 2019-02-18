package com.codingblocks.Lecture_11;

public class QueueCircular extends Queue {
    protected int[] data;
    protected int end;
    protected int front;
    private int size;

    private static final int DEFAULT_SIZE = 10;

    public QueueCircular() {
        this.size = 0;
        this.front = 0;
        this.end = -1;
        this.data = new int[DEFAULT_SIZE];
    }

    public QueueCircular(int size){
        this.size = 0;
        this.front = 0;
        this.end = -1;
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean isFull(){
        return this.size == this.data.length;
    }

    public void insert(int item){
        if(!isFull()){
            this.end = ( this.end + 1) % this.data.length;
             size++;
            this.data[this.end] = item;
        }
    }

    public int delete() throws Exception{
        if(!this.isEmpty()){
            int temp = data[front];
            this.front = ( this.front + 1) % this.data.length;
            size--;
            return temp;
            //front++;

        }
        throw new Exception("Queue is empty");
    }
    public void display(){
        for (int i = front; i < front + size ; i++) {
            System.out.print(data[i % data.length] + ", ");
        }
        System.out.println("End");
    }
}
