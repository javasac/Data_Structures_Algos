package com.sachin.DSA.Queue;

import java.util.Arrays;

public class QueueArray
{
    int[] arr;
    int top;
    int begin;

    QueueArray(int size)
    {
        this.arr = new int[size];
        this.top = -1;
        this.begin = -1;
        System.out.println("Queue is created with size " + size);
    }

    // display all elements
    void printAll()
    {
        Arrays.stream(arr).forEach(System.out::println);
    }

    void enQueue(int val)
    {
        if (isFull())
        {
            System.out.println("Queue is full.");
        }
        else if (isEmpty())
        {
            begin = 0;
            top++;
            arr[top] = val;
            System.out.println("Added value = " + val + " in the Queue.");
        }
        else
        {
            top++;
            arr[top] = val;
            System.out.println("Added value = " + val + " in the Queue.");
        }
    }

    boolean isEmpty()
    {
        if (begin == -1)
        {
            System.out.println("Queue is empty.");
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isFull()
    {
        if (top==arr.length-1)
        {
            System.out.println("Queue is full.");
            return true;
        }
        else
        {
            return false;
        }
    }
}




