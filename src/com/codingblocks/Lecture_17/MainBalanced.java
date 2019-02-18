package com.codingblocks.Lecture_17;

public class MainBalanced {
    public static void main(String[] args) {
        BSTBalanced<Integer> bstb = new BSTBalanced<>();
        for (int i = 0; i < 1000000; i++) {
            bstb.add(i);
        }
        System.out.println(bstb.height());
        //bstb.display();
//        bstb.add(3);
//        bstb.add(5);
//        bstb.add(1);
//        bstb.add(2);
//        bstb.add(4);
//        bstb.display();
//        bstb.rightRotation();
//        bstb.display();
//        bstb.leftRotation();
//        bstb.display();

    }
}
