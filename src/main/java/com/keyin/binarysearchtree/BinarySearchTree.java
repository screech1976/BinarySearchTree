package com.keyin.binarysearchtree;

class BinarySearchTree {



    class Node {
        int key;
        Node left, right;

        public Node(int data)
        {
            key = data;
            left = right = null;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }


    Node root;


    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int val) {
        root = new Node(val);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    int minValue(Node root) {
        int minval = root.key;


        while (root.left != null) {
            minval = root.left.key;
            root = root.left;
        }

        return minval;
    }


    void insert(int key) {
        root = insertRecur(root, key); }


    Node insertRecur(Node root, int key)
    {


        if (root == null) {
            root = new Node(key);
            return root;
        }


        if (key < root.key)
            root.left = insertRecur(root.left, key);
        else if (key > root.key)
            root.right = insertRecur(root.right, key);


        return root;
    }


    void inorder() {
        inorderRecur(root);
    }


    void inorderRecur(Node root)
    {
        if (root != null) {
            inorderRecur(root.left);
            System.out.println(root.key);
            inorderRecur(root.right);
        }
    }


    void delete(int key) {
        root = delete_recursive(root, key);
    }


    Node delete_recursive(Node root, int key) {

        if (root == null) {
            return root;
        }


        if (key < root.key) {
            root.left = delete_recursive(root.left, key);
        } else if (key > root.key) {
            root.right = delete_recursive(root.right, key);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }


            root.key = minValue(root.right);


            root.right = delete_recursive(root.right, root.key);
        }

        return root;
    }



}