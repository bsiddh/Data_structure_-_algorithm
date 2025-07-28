package com.linkedlist.java;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
        myLinkedList.append(2);
//        myLinkedList.printList();
//        myLinkedList.removeLast();

        //(2) Items -return 2 Node
        System.out.println(myLinkedList.removeLast().value);
        //(1) Item - return 1 Node
        System.out.println(myLinkedList.removeLast().value);
        //(0) Items - returns null
        System.out.println(myLinkedList.removeLast());
    }
}
