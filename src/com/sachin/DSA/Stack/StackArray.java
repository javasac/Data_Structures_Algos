package com.sachin.DSA.Stack;

// Space and Time Complexity of all methods is O(1)
public class StackArray
{
    int[] arr;
    int top = -1;

    public StackArray(int size)
    {
        this.arr = new int[size];
        this.top = -1;
        System.out.println("Stack with size is created " + size);
    }

    void deleteStack()
    {
        arr = null;
        System.out.println("Stack has been deleted.");
    }

    int peek()
    {
        if (this.isEmpty())
        {
            return 0;
        }
        else
        {
            int ele = arr[top];
            return ele;
        }
    }

    int pop()
    {
        if (this.isEmpty())
        {
            return 0;
        }
        else
        {
            int ele = arr[top];
            top--;
            return ele;
        }
    }

    void push(int value)
    {
        if (this.isFull())
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            arr[top] = value;
            System.out.println("Value added to Stack = " + value + " Top = " + top);
        }
    }

    boolean isFull()
    {
        if (top == arr.length-1)
        {
            System.out.println("Stack is full.");
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isEmpty()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty.");
            return true;
        }
        else
        {
            return false;
        }
    }
}
