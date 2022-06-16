package com.bridgelabz.linkedlist;

import junit.framework.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void SearchNodeWithValue_WhenFind_ShouldReturnTrue() {

        IList<Integer> linkedList = new LinkedList<>() ;
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        Assert.assertTrue(linkedList.search(30));
    }
}


