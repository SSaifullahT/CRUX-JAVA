package com.codingblocks.Lecture_17;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
//        bst.add(5);
//        bst.add(3);
//        bst.add(7);
//        bst.add(6);
//        bst.add(1);
//        bst.display();
//        bst.max();
//        System.out.println(bst.min());
//        System.out.println(bst.find(1));
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        bst.generate(arr);
        bst.range(2,7);
    }
}
