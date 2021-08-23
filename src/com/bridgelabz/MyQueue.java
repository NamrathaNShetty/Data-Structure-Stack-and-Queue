package com.bridgelabz;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    /* This method is used for display the output */
    public void printQueue() {
        myLinkedList.printMyNodes();
    }
}