package com.sachin.DSA.BST;

public class BinarySearchTree
{
    Node root;
    int size = 0;

    Node insert(Node root, int x)
    {
        if (root == null)
        {
            root = new Node(x);
            return root;
        }
        if (x < root.data)
        {
            root.left = insert(root.left, x);
        }
        else if (x > root.data)
        {
            root.right = insert(root.right, x);
        }
        return root;
    }

    // pre-order Traversal means Root -> Left -> Right
    int preOrder(Node node)
    {
        if (node!=null)
        {
            size++;
            System.out.println(node.data + " ");
            this.preOrder(node.left);
            this.preOrder(node.right);
        }
        return size;
    }

    // in-order Traversal means Left -> Root -> Right
    int inOrder(Node node)
    {
        if (node!=null)
        {
            this.inOrder(node.left);
            System.out.println(node.data + " ");
            this.inOrder(node.right);
        }
        return size;
    }

    // Post-order Traversal means Left -> Right -> Root
    int postOrder(Node node)
    {
        if (node!=null)
        {
            this.postOrder(node.left);
            this.postOrder(node.right);
            System.out.println(node.data + " ");
        }
        return size;
    }

    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        int size = 0;

        tree.root = tree.insert(tree.root, 25);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 33);
        tree.insert(tree.root, 22);
        tree.insert(tree.root, 35);

        size = tree.preOrder(tree.root);
        System.out.println("Pre-order Traversal (Root -> Left -> Right) and size = " + size);

        size = tree.inOrder(tree.root);
        System.out.println("In-order Traversal (Left -> Root -> Right) and size = " + size);

        size = tree.postOrder(tree.root);
        System.out.println("Post-order Traversal (Left -> Right -> Root) and size = " + size);

    }
}
