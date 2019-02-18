package com.codingblocks.Lecture_19;

import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{

    private ArrayList<T> data;

    public void add(T value){
        //add at last location
        data.add(value);
        //now up heap
        upheap(data.size() - 1);
    }
    private void upheap(int index){
        if(index <= 0){
            return;
        }
        int parent = parent(index);

        if(data.get(parent).compareTo(data.get(index)) > 0){
           swap(index,parent);
           upheap(parent);
        }

    }

    public T remove(){
        T first = data.get(0);
        T last = data.remove(data.size() - 1);
        //check weather only 1 element
        if(data.size() > 0){
            data.set(0, last);

            downheap(0);
        }
        return first;
    }

    private void downheap(int index){
//        if(index >= data.size()){
//            return;
//        }
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < data.size() && data.get(min).compareTo(data.get(left)) > 0){
            min = left;
        }
        if(right < data.size() && data.get(min).compareTo(data.get(right)) > 0){
            min = right;
        }
        if(min != index){
            swap(min, index);
            downheap(min);
        }
    }

    private void swap(int first, int second){
        T temp = data.get(first);
        data.set(first,data.get(second));
        data.set(second,temp);
    }

    public Heap(){
        data = new ArrayList<>();
    }

    public int parent(int index){
        return (index - 1) / 2;
    }

    public int left(int index){
        return (index * 2) + 1;
    }

    public int right(int index){
        return (index * 2) + 2;
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public T min(){
        return data.get(0);
    }
}
