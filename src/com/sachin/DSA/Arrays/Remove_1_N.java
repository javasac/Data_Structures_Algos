package com.sachin.DSA.Arrays;
import java.util.Arrays;

// remove first and last element
public class Remove_1_N
{
    static int[] middle(int[] array)
    {
        int[] arr = new int[array.length-2];
        for (int i=1; i<array.length-1; i++)
        {
            arr[i-1] = array[i];
            System.out.println(array[i]);
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4};
        int[] fi = new int[arr.length-2];

        fi = middle(arr);
        Arrays.stream(fi).forEach(System.out::println);
    }
}
