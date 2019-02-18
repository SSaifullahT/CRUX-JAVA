package com.codingblocks.Lecture_16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void generate(){
        Scanner s = new Scanner("10 true 7 true 3 false false true 8 false false true 13 false false");
        System.out.print("Enter root node :");
        int value = s.nextInt();

        root = new Node(value);

        generate(root, s);
    }

    private void generate(Node node, Scanner s){
        System.out.print("Do you want to add left of " + node.value);
        boolean left = s.nextBoolean();

        if (left){
            System.out.print("Enter left node  of " + node.value);
            int value = s.nextInt();
            node.left = new Node(value);
            generate(node.left, s);
        }

        System.out.print("Do you want to add right of " + node.value);
        boolean right = s.nextBoolean();

        if (right){
            System.out.print("Enter right node  of " + node.value);
            int value = s.nextInt();
            node.right = new Node(value);
            generate(node.right, s);
        }
    }

    public void display(){
        display(root, "", "root");
    }

    private void display(Node node, String indent, String type){
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);

        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
    }

    public void inOrder(){
        inOrder(root);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void inOrder(Node node){
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + ", ");
        inOrder(node.right);
    }

    private void preOrder(Node node){
        if (node == null){
            return;
        }

        System.out.print(node.value + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void postOrder(Node node){
        if (node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + ", ");

    }

    public int diameter(){

        if (root == null){
            return 0;
        }

        return depth(root.left) + depth(root.right) + 3;
    }

    public int height(){
        return depth(root) + 1;
    }

    private int depth(Node node){
        if (node == null){
            return -1;
        }

        int max = Math.max(depth(node.left), depth(node.right));

        return max + 1;
    }

    public void levelOrder(){
        if (root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            Node front = queue.remove();

            System.out.print(front.value + " ");

            if (front.left != null){
                queue.add(front.left);
            }

            if (front.right != null){
                queue.add(front.right);
            }
        }
    }

    public void genPreIn(int[] pre, int[] in){
        root = genPreInRec(pre, in);
    }

    private Node genPreInRec(int[] pre, int[] in) {
        if (pre.length == 0){
            return null;
        }

        int r = pre[0];

        int index = linear(in, r);

        Node node = new Node(r);

        int[] pre_left = Arrays.copyOfRange(pre, 1, index + 1);
        int[] pre_right = Arrays.copyOfRange(pre, index + 1, pre.length);

        int[] in_left = Arrays.copyOfRange(in, 0, index);
        int[] in_right = Arrays.copyOfRange(in, index + 1, in.length);

        node.left = genPreInRec(pre_left, in_left);
        node.right = genPreInRec(pre_right, in_right);

        return node;

    }

    private int linear(int[] nums, int value){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value){
                return i;
            }
        }

        return -1;
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
