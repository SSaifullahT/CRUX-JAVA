package com.codingblocks.Lecture_20;

public class GraphAdjListClient {
    public static void main(String[] args) {
        AdjListGraph<Integer> graph = new AdjListGraph<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 4);
        graph.addEdge(4, 3);

//        graph.dft();
//        System.out.println();
//        graph.bft();
        System.out.println(graph.connectedComponent());
        System.out.println(graph.cyclic());

    }
}
