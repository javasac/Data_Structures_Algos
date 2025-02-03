package com.sachin.DSA.LinkedList;

// Time Complexity = O(N) and Space Complexity = O(1)
public class SinglyLinkedList
{
    public Node head;
    public Node tail;
    public int size;

    void deleteNode(int x)
    {
        Node curr = head;
        Node prev = null;

        for (int i=1; i<size; i++)
        {
            if (x==curr.value)
            {
                if (prev!=null)
                {
                    prev.next = curr.next;
                }
                else
                {
                    head = curr.next;
                }

                System.out.println("Deleted Node with Value = " + x);
                size = size - 1;
                this.printLinkedList();
                return;
            }
            else
            {
                prev = curr;
                curr = curr.next;
            }
        }
        this.printLinkedList();
    }

    void findElement(int a)
    {
        Node n = head;
        System.out.println("Size is " + size + " and trying to find " + a);

        for (int i=1; i<=size; i++)
        {
            if (a == n.value)
            {
                System.out.println("Found " + a);
                return;
            }
            else
            {
                n = n.next;
            }
        }
        System.out.println("Not found " + a);
    }

    void printLinkedList()
    {
        Node n = head;
        System.out.println("Size is " + size);

        for (int i=1; i<=size; i++)
        {
            System.out.print(n.value + " -> ");
            n = n.next;
        }
        System.out.println();
    }

    void addNode(int x, int loc)
    {
        Node newNode = new Node();
        newNode.value = x;

        if (head == null)
        {
            this.createSinglyLL(x);
            return;
        }
        if (loc==0)
        {
            newNode.next = head;
            head = newNode;
            size = size + 1;
        }
        else if (loc>=size)
        {
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
            size = size + 1;
        }
        else
        {
            Node n = head;
            for (int i=1; i<loc; i++)
            {
                n = n.next;
            }
            newNode.next = n.next;
            n.next = newNode;
            size = size + 1;
            System.out.println("Insert node at " + loc + " value is " + n.value);
        }

        this.printLinkedList();
    }

    public Node createSinglyLL(int nodeValue)
    {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        this.printLinkedList();
        return head;
    }
}
