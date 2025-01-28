package org.example;

import static org.junit.jupiter.api.Assertions.*;

class AvlTreeTest {

    @org.junit.jupiter.api.Test
    void countStructure() {
        // Placeholder test for countStructure
        AvlTree root = new AvlTree(10);
        root.countStructure(root);
        assertNotNull(root); // Basic test to verify the method executes
    }

    @org.junit.jupiter.api.Test
    void dumpRootStructure() {
        AvlTree root = new AvlTree(10);
        root.dumpRootStructure(root);
        assertNotNull(root); // Ensure the method runs without issues
    }

    @org.junit.jupiter.api.Test
    void hybridRepOK() {
        AvlTree root = new AvlTree(10);
        assertTrue(root.hybridRepOK());
    }

    @org.junit.jupiter.api.Test
    void left() {
        AvlTree leftNode = new AvlTree(5);
        AvlTree root = new AvlTree(10, 2, leftNode, null);
        assertEquals(leftNode, root.left());
    }

    @org.junit.jupiter.api.Test
    void right() {
        AvlTree rightNode = new AvlTree(15);
        AvlTree root = new AvlTree(10, 2, null, rightNode);
        assertEquals(rightNode, root.right());
    }

    @org.junit.jupiter.api.Test
    void findMinimum() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertEquals(5, root.findMinimum(root));
    }

    @org.junit.jupiter.api.Test
    void contains() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.contains(root, 5));
        assertFalse(root.contains(root, 20));
    }

    @org.junit.jupiter.api.Test
    void insert() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.contains(root, 5));
        assertTrue(root.contains(root, 15));
    }

    @org.junit.jupiter.api.Test
    void bfsTraverse() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        root.bfsTraverse(root); // Test that the method runs without errors
    }

    @org.junit.jupiter.api.Test
    void dfsTraverse() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.dfsTraverse(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_ConcretePost() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_ConcretePost(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_StructurePost() {        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_StructurePost(root));

    }

    @org.junit.jupiter.api.Test
    void repOK_Concrete() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_Concrete(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_Structure() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_Structure(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_Structure_CheckHeight() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_Structure_CheckHeight(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_Ordered() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_Ordered(root));
    }

    @org.junit.jupiter.api.Test
    void repOK_ElementsAreOrdered() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        assertTrue(root.repOK_ElementsAreOrdered(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @org.junit.jupiter.api.Test
    void dumpTree() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        AvlTree.dumpTree(root); // Ensure the method runs without issues
    }

    @org.junit.jupiter.api.Test
    void myMethodTest() {
        AvlTree root = new AvlTree(10);
        root = root.insert(root, 5);
        root = root.insert(root, 15);
        root.myMethodTest(root);
        assertNotNull(root);
    }

    @org.junit.jupiter.api.Test
    void main() {
        AvlTree.main(new String[0]); // Test that the main method runs without errors

    }
}