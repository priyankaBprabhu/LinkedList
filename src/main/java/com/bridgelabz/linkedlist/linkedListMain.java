package com.bridgelabz.linkedlist;

public class linkedListMain {
    public static void main(String[] args) {
        System.out.println("Linked list Implementations");
        IList <Integer> linkedList = new LinkedList<>() ;
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        System.out.println(linkedList);
    }
}
