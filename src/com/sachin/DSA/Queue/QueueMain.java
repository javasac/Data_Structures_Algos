package com.sachin.DSA.Queue;

public class QueueMain
{
    public static void main(String[] args)
    {
        QueueArray qa = new QueueArray(5);

        qa.isFull();
        qa.isEmpty();

        qa.enQueue(1);
        qa.enQueue(2);
        qa.enQueue(3);
        qa.enQueue(4);
        qa.enQueue(5);

        qa.printAll();
    }
}
