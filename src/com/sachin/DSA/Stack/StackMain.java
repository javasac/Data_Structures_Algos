package com.sachin.DSA.Stack;

public class StackMain
{
    public static void main(String[] args)
    {
        StackArray as = new StackArray(4);

        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        as.push(5);

        System.out.println("Peek value is " + as.peek());
        System.out.println("Popped value is " + as.pop());
        System.out.println("Popped value is " + as.pop());
        System.out.println("Peek value is " + as.peek());
        System.out.println("Peek value is " + as.peek());

        //as.isEmpty();
        //as.isFull();
    }
}
