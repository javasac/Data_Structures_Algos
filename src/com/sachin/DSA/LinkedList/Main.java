package com.sachin.DSA.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.createSinglyLL(5);
        sLL.addNode(1, 0);
        //sLL.addNode(10, 6);
        sLL.addNode(7, 2);
        //sLL.addNode(2, 1);
        sLL.addNode(-5, 0);
        sLL.addNode(8, 5);
        sLL.findElement(10);
        sLL.deleteNode(10);
    }
}
