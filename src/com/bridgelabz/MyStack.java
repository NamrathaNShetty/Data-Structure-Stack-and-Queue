package com.bridgelabz;


public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    /*Method to add elements to stack
    *70 will be added first , then 30 and lastly 56
     */
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    /*Method is used to display the output */
    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }
}
