package com.bridgelabz.linkedlist;

public class linkedListMain {
    public static void main(String[] args) {
        System.out.println("Linked list Implementations");
        IList<Integer> linkedList = new LinkedList<>() ;
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        System.out.println(linkedList);
    }
}
