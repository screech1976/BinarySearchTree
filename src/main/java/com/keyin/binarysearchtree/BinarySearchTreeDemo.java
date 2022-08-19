package com.keyin.binarysearchtree;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /*  Insert values to make BST
                                */
        tree.insert(33);
        tree.insert(80);
        tree.insert(50);
        tree.insert(96);
        tree.insert(42);
        tree.insert(23);
        tree.insert(99);

        // print inorder traversal of the BST
        tree.inorder();

        System.out.println();

        ObjectMapper mapper = new ObjectMapper();

        try {
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(tree);
            System.out.println();
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println();

        tree.delete(50);
        tree.inorder();
    }
}