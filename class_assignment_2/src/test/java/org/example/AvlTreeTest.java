package org.example;

import static org.junit.jupiter.api.Assertions.*;

class AvlTreeTest {

    @org.junit.jupiter.api.Test
    void countStructure() {
        // Test to ensure countStructure method executes without errors
        AvlTree root = new AvlTree(10);
        root.countStructure(root);
        assertNotNull(root);
    }

    @org.junit.jupiter.api.Test
    void dumpRootStructure() {
        // Test to ensure dumpRootStructure method executes without errors
        AvlTree root = new AvlTree(10);
        root.dumpRootStructure(root);
        assertNotNull(root);
    }

    @org.junit.jupiter.api.Test
    void hybridRepOK() {
        // Test to verify hybridRepOK method returns true
        AvlTree root = new AvlTree(10);
        assertTrue(root.hybridRepOK());
    }

    @org.junit.jupiter.api.Test
    void left() {
        // Test to verify the left child of a node
        AvlTree leftNode = new AvlTree(5);
        AvlTree root = new AvlTree(10, 2, leftNode, null);
        assertEquals(leftNode, root.left());
    }

    @org.junit.jupiter.api.Test
    void right() {
        // Test to verify the right child of a node
        AvlTree rightNode = new AvlTree(15);
        AvlTree root = new AvlTree(10, 2, null, rightNode);
        assertEquals(rightNode, root.right());
    }

    @org.junit.jupiter.api.Test
    void findMinimum() {
        // Test to find the minimum value in the AVL tree
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertEquals(5, root.findMinimum(root));
    }

    @org.junit.jupiter.api.Test
    void contains() {
        // Test to check if the tree contains certain values
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.contains(root, 5));
        assertFalse(root.contains(root, 20));
    }

    @org.junit.jupiter.api.Test
    void insert() {
        // Test to verify values are correctly inserted into the tree
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.contains(root, 5));
        assertTrue(root.contains(root, 15));
    }

    @org.junit.jupiter.api.Test
    void bfsTraverse() {
        // Test to verify BFS traversal runs without errors
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        root.bfsTraverse(root);
    }

    @org.junit.jupiter.api.Test
    void dfsTraverse() {
        // Test to verify DFS traversal returns true
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.dfsTraverse(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_ConcretePost() {
        // Test to check the repOK_ConcretePost method
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_ConcretePost(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_StructurePost() {
        // Test to check the repOK_StructurePost method
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_StructurePost(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_Concrete() {
        // Test to check the repOK_Concrete method
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_Concrete(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_Structure() {
        // Test to check the repOK_Structure method
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_Structure(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_Structure_CheckHeight() {
        // Test to check the repOK_Structure_CheckHeight method
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_Structure_CheckHeight(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_Ordered() {
        // Test to check the repOK_Ordered method
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_Ordered(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_ElementsAreOrdered() {
        // Test to check that elements in the tree are correctly ordered
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_ElementsAreOrdered(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @org.junit.jupiter.api.Test
    void dumpTree() {
        // Test to verify the dumpTree method runs without issues
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        AvlTree.dumpTree(root);
    }

    @org.junit.jupiter.api.Test
    void myMethodTest() {
        // Test to ensure myMethodTest executes without errors
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        root.myMethodTest(root);
        assertNotNull(root);
    }

    @org.junit.jupiter.api.Test
    void main() {
        // Test to ensure the main method runs without errors
        AvlTree.main(new String[0]);
    }
}