package com.codingblocks.Lecture_20;

public class GraphEdgeClient {
    public static void main(String[] args) {
        EdgeListGraph<Integer> graph = new EdgeListGraph<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1, 2);
        graph.addEdge(2 ,3);


        System.out.println(graph.startFrom(2));
    }
}
