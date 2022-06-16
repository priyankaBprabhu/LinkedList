package com.bridgelabz.linkedlist;

public class LinkedList<T> implements IList<T> {
    Node head;
    Node temp;

    @Override
    public void add(T num) {
        Node node = new Node(num);
        if (head == null) {
            head = node;
            return;
        }
        temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    @Override
    public boolean remove(T num) {
        if(head.data.equals(num)){
            head = head.next;
            return true;
        }
        Node previous = head;
        Node requiredData ;
        while (previous.next != null && !previous.next.data.equals(num)){
                previous = previous.next;
        }
        requiredData = previous.next;
        previous.next = requiredData.next;
        return true ;
    }

    @Override
    public boolean search(T num) {

        if (head.data == num) {
            return true;
        }
        Node found = head;
        while (found.next.data != null ) {
            if(found.next.data == num)
                return true;
            found = found.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void append(T num) {
        Node node = new Node( num);
        if (head == null) {
            head = node;
            return;
        }
        temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    @Override
    public int size() {
        temp=head;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    @Override
    public void pop() {
        head = head.next;
    }
    @Override
    public void insert(int pos,T num ) {
        Node newNode = new Node(num);
        if(pos == index((T) head.data)){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node requiredNode = head.next;
        Node previousNode = head;
        while(pos != index((T) requiredNode.data)){
            previousNode = requiredNode;
            requiredNode = requiredNode.next;
        }
        newNode.next = requiredNode;
        previousNode.next = newNode;
    }

    @Override
    public void addFirst(T num) {
        Node node = new Node(num);
        Node newNode ;
        if (head != null ) {
            newNode = node;
            newNode.next =head;
        }
        head = node;
    }

    @Override
    public int index(T data) {
        int i=0;
        Node temp =head;
        while( temp!= null && !temp.data.equals(data)) {
            temp = temp.next;
            i++;
        }
        return i;

    }

    @Override
    public String toString() {
        return "LinkedList " +
                " head = " + head;
    }
}