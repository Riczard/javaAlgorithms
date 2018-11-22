package com.codecool.binarySearchTree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void testSearchExpectedTrue() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(30);
        BinarySearchTree myTree = BinarySearchTree.build(numbers);
        assertEquals(true,myTree.search(30));
    }

}