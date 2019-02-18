package com.codingblocks.Lecture_17;

public class BSTBalanced<T extends Comparable<T>> {

    private Node root;

    public void add(T value) {
        this.root = add(value, root);//returning references
    }

    private Node add(T value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (node.value.compareTo(value) > 0) {
            node.left = add(value, node.left);
        }

        if ((node.value.compareTo(value) < 0)) {
            node.right = add(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        //balance code
        node = balance(node);

        return node;
    }

    private Node balance(Node node){
        if(height(node.left) - height(node.right) > 1){
            if(height(node.left.left) - height(node.left.right) >= 0){
                return rightRotation(node);
            }else {
                node.left = leftRotation(node.left);
                return rightRotation(node);
            }
        }else if(height(node.left) - height(node.right) < -1){
            if(height(node.right.left) - height(node.right.right) <= 0){
                return leftRotation(node);
            }else {
                node.right = rightRotation(node.right);
                return leftRotation(node);
            }
        }
        return node;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        if (Math.abs(height(node.left) - height(node.right)) > 1) {
            return false;
        }
        return balanced(node.left) && balanced(node.right);
    }

    public void max() {
        max(root);
    }

    private void max(Node node) {
        if (node.right == null) {
            System.out.println(node.value);
            return;
        }

        max(node.right);
    }


    public T min() {
        Node node = root;
        while (node.left != null) {
            node = node.left;
        }

        return node.value;
    }

//    private void min(Node node){
//        if(node.left == null){
//            System.out.println(node.value);
//            return;
//        }
//
//        min(node.left);
//    }

    public void inOrder() {
        inOrder(root);
    }

    public void preOrder() {
        preOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + ", ");
        inOrder(node.right);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + ", ");

    }

    public boolean find(T value) {
//        if(root == null){
//            return false;
//        }
        Node node = root;

        while (node != null) {
//            if(node.value.compareTo(value) == 0){
//                return true;
//            }
//
            if (node.value.compareTo(value) > 0) {
                node = node.left;
            } else if (node.value.compareTo(value) < 0) {
                node = node.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public void generate(T[] values) {
//        for (int i = 0; i < values.length; i++) {
//            this.add(values[i]);
//        }
        this.root = generate(values, 0, values.length);//end exclusive
//this is used for instance variable
    }

    private Node generate(T[] values, int start, int end) {
        if (start >= end) {
            return null;
        }
        int mid = (start + end) / 2;

        Node node = new Node(values[mid]);

        node.left = generate(values, start, mid);
        node.right = generate(values, mid + 1, end);

        return node;
    }


    public void display() {
        display(root, "", "root");
    }

    private void display(Node node, String indent, String type) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value + " " + type);

        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
    }

    public void range(T start, T end) {
        range(root, start, end);
    }

    private void range(Node node, T start, T end) {
        if (node == null) {
            return;
        }
        if (node.value.compareTo(start) >= 0) {
            range(node.left, start, end);
        }
        if (node.value.compareTo(start) >= 0 && node.value.compareTo(end) <= 0) {
            System.out.print(node.value + " ");
        }
        if (node.value.compareTo(end) <= 0) {
            range(node.right, start, end);
        }

    }

    public int height(){
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }

        return node.height;
    }

    public void rightRotation() {
        root = rightRotation(root);
    }

    private Node rightRotation(Node x) {
        Node y = x.left;
        Node T2 = y.right;
       // Node temp1 = x;

//
        y.right = x;
        x.left = T2;

        x.height = Math.max(height(x.right), height(x.left)) + 1;
        y.height = Math.max(height(y.right), height(y.left)) + 1;

        return y;
    }

    public void leftRotation() {
        root = leftRotation(root);
    }

    private Node leftRotation(Node y) {
        Node x = y.right;
        Node T2 = x.left;
//
        x.left = y;
        y.right = T2;

        y.height = Math.max(height(y.right), height(y.left)) + 1;
        x.height = Math.max(height(x.right), height(x.left)) + 1;

        return x;
    }

    private class Node {
        private T value;
        private Node left;
        private Node right;
        private int height;

        public Node(T value) {
            this.value = value;
            this.height = 1;
        }
    }
}
