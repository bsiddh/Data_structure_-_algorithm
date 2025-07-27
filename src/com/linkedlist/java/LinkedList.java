package com.linkedlist.java;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

//inner class
    class Node {
        int value;
        Node next;//it is pointer to the node.

        Node(int value) {
            this.value = value;
        }
    }
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }

        public void getHead() {
            System.out.println("Head: " + head.value);
        }

        public void getTail() {
            System.out.println("Tail: " + tail.value);
        }

        public void getLength() {
            System.out.println("Length: " + length);
        }


        //append method
        public void append(int value)
        {
        Node newNode = new Node(value);
        if (length==0)
        {
            head = newNode;
            tail = newNode;
        }else
        {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
        }

}
