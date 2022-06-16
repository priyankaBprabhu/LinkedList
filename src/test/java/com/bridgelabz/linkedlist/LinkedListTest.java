package com.bridgelabz.linkedlist;

import junit.framework.Assert;
import org.junit.Test;

public class LinkedListTest {
    IList<Integer> linkedList = new LinkedList<>() ;
    @Test
    public void SearchNodeWithValue_WhenFind_ShouldReturnTrue() {
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        Assert.assertTrue(linkedList.search(30));
    }
    @Test
    public void SearchNodeWithValue_WhenFind_InsertNewNode() {
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        linkedList.insert((linkedList.index(30) + 1),40);
        System.out.println(linkedList);
        Assert.assertTrue(linkedList.search(40));

    }
}


