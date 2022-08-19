package com.keyin.binarysearchtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {


    BinarySearchTree tree = new BinarySearchTree();

    // Insert values
    @BeforeEach
    void setup() {
        tree.insert(33);
        tree.insert(80);
        tree.insert(50);
        tree.insert(96);
        tree.insert(42);
        tree.insert(23);
        tree.insert(99);
    }

    @Test
    void testIfRootNode_NotNull() {
        Assertions.assertNotNull(tree.getRoot());
    }

    @Test
    void testRightNodeExists() {
        Assertions.assertEquals(80, tree.root.getRight().key);
    }

    @Test
    void testLeftNodeExists() {
        Assertions.assertEquals(23, tree.root.getLeft().key);
    }

}
