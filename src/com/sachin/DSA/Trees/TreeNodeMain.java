package com.sachin.DSA.Trees;

import com.sun.source.tree.Tree;

public class TreeNodeMain
{
    public static void main(String[] args)
    {
        TreeNode drinks = new TreeNode("Drinks");

        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        drinks.addChild(hot);
        drinks.addChild(cold);

        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        hot.addChild(tea);
        hot.addChild(coffee);

        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        cold.addChild(wine);
        cold.addChild(beer);

        System.out.println(drinks.print(2));
    }
}
