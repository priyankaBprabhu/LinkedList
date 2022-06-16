package com.bridgelabz.linkedlist;

public class Node<T> {
    T data;
    Node next;
    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{ " +
                " data = " + data +
                ", next = " + next +
                "}";
    }



    public void setNext(Node next) {

        this.next = next;
    }

    public Node getNext() {

        return next;
    }
}
