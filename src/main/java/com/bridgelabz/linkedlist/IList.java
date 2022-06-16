package com.bridgelabz.linkedlist;

public interface IList<T> {
    void add(T num);
    boolean remove(T num);
    boolean search(T num);
    boolean isEmpty();
    int size();
    void append(T num);
    void pop();
    void popLast();
    void addFirst(T num);
    int index(T data);
    void insert(int pos,T num );
}
