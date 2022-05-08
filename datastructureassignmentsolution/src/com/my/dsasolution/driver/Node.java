package com.my.dsasolution.driver;

public class Node
{
    public int val;
    public Node left, right;
    
    public Node(int item)
    {
        val = item;
        left = right = null;
    }
}