package com.codingblocks.Lecture_20;

import java.util.*;

public class AdjListGraph <T>{

    private LinkedList<Vertex> vertices;

    public AdjListGraph() {
        vertices = new LinkedList<>();
    }

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }



    public void dft(){
        if (vertices.isEmpty()) {
            return;
        }

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();

        Vertex f = vertices.get(0);

        stack.push(f);
        visited.add(f);

        while (!stack.isEmpty()){
            Vertex top = stack.pop();
            System.out.println(top.value);
            for (Vertex v : top.neighbours) {
                if(!visited.contains(v)){
                    stack.push(v);
                    visited.add(v);
                }
            }
        }
    }

    public void bft(){
        if(vertices.isEmpty()){
            return;
        }
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();
        Vertex f = vertices.get(0);
        queue.add(f);
        visited.add(f);
        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            System.out.println(top.value);
            for (Vertex v : top.neighbours) {
                if(!visited.contains(v)){
                    queue.add(v);
                    visited.add(v);
                }
            }
        }
    }

    public LinkedList<LinkedList<T>> connectedComponent(){
        LinkedList<LinkedList<T>> components = new LinkedList<>();
        if (vertices.isEmpty()) {
            return components;
        }
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();
        for (Vertex f:vertices) {
            if (!visited.contains(f)) {
                stack.push(f);
                visited.add(f);
                LinkedList<T> comp = new LinkedList<>();
                while (!stack.isEmpty()) {
                    Vertex top = stack.pop();
                    comp.add(top.value);
                    for (Vertex v : top.neighbours) {
                        if (!visited.contains(v)) {
                            stack.push(v);
                            visited.add(v);
                        }
                    }
                }
                components.add(comp);
            }
        }
        return components;
    }

    public boolean cyclic(){
        if (vertices.isEmpty()) {
            return false;
        }

        HashMap<Vertex, Vertex> map = new HashMap<>();
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();

        Vertex f = vertices.get(0);

        stack.push(f);
        visited.add(f);

        while (!stack.isEmpty()){
            Vertex top = stack.pop();

            for (Vertex v : top.neighbours) {
                if(!visited.contains(v)){
                    map.put(top, v);
                    stack.push(v);
                    visited.add(v);
                }else {
                    if(v != map.get(top)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void addEdge(T start, T end){
        Vertex s_v = find(start);
        Vertex e_v = find(end);
        if(s_v != null && e_v != null) {
            //biderectional vertex
            s_v.neighbours.add(e_v);
            e_v.neighbours.add(s_v);
        }
    }

    private boolean exists(T value){
        for (Vertex v: vertices) {
            if(v.value.equals(value)){
                return true;
            }
        }
        return false;
    }

    private Vertex find(T value){
        for (Vertex v: vertices) {
            if(v.value.equals(value)){
                return v;
            }
        }
        return null;
    }


    private class Vertex{
        private T value;
        private LinkedList<Vertex> neighbours;
        private Vertex(T value) {
            this.value = value;
            neighbours = new LinkedList<>();
        }
    }
}
