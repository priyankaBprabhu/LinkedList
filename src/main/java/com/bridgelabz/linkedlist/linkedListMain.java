package com.bridgelabz.linkedlist;

public class linkedListMain {
    public static void main(String[] args) {
        System.out.println("Linked list Implementations");
        IList<Integer> linkedList = new LinkedList<>() ;
        linkedList.addFirst(70);
        linkedList.addFirst(30);
        linkedList.addFirst(56);
        System.out.println(linkedList);
    }
}
