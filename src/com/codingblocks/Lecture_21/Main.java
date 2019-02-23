package com.codingblocks.Lecture_21;

public class Main {

    public static void main(String[] args) {
        AdjMapGraph<Integer> graph = new AdjMapGraph<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);
        graph.addVertex(8);
        graph.addVertex(9);

//        graph.addEdge(1,2);
//        graph.addEdge(1,4);
//        graph.addEdge(2,3);
//        graph.addEdge(4,5);
//        graph.addEdge(4,7);
//        graph.addEdge(5,6);
//        graph.addEdge(7,8);
//        graph.addEdge(8,9);
        graph.addEdge(1,2);
        graph.addEdge(3,2);
        graph.addEdge(4,5);
        graph.addEdge(4,6);
        graph.addEdge(7,8);
        graph.addEdge(7,9);

//        graph.bft(1);
//
//        System.out.println();
//
//        graph.dft(1);
//        System.out.println();
//        System.out.println(graph.bfs(1,6));
        System.out.println(graph.connectedComponent());

    }
}
