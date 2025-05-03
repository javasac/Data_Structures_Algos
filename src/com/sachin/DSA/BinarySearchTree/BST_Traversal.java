package com.sachin.DSA.BinarySearchTree;

class BST_Traversal
{
    int size = 0;
    Node root = null;

    Node addNode(Node root, int x)
    {
        if (root == null)
        {
            root = new Node(x);
        }
        else if (x <= root.data)
        {
            root.left = this.addNode(root.left, x);
        }
        else if (x >= root.data)
        {
            root.right = this.addNode(root.right, x);
        }
        return root;
    }

    // pre-order means Root -> Left -> Right
    void preOrder(Node node)
    {
        if (node!=null)
        {
            size++;
            System.out.print(node.data + " ");
            this.preOrder(node.left);
            this.preOrder(node.right);
        }
    }

    int Height()
    {
        return treeHeight(root);
    }

    private int treeHeight(Node root)
    {
        if (root == null)
        {
            return -1;
        }

        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // In-order means Left -> Root -> Right
    void inOrder(Node node)
    {
        if (node!=null)
        {
            this.inOrder(node.left);
            System.out.print(node.data + " ");
            this.inOrder(node.right);
        }
    }

    // Post-order means Left -> Right -> Root
    void postOrder(Node node)
    {
        if (node!=null)
        {
            this.postOrder(node.left);
            this.postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args)
    {
        BST_Traversal tree = new BST_Traversal();

        tree.root = tree.addNode(tree.root, 10);
        tree.addNode(tree.root, 9);
        tree.addNode(tree.root, 11);
        tree.addNode(tree.root, 14);
        tree.addNode(tree.root, 7);

        System.out.println("Pre-order Traversal (Root -> Left -> Right)");
        tree.preOrder(tree.root);

        System.out.println();
        System.out.println("In-order Traversal (Left -> Root -> Right)");
        tree.inOrder(tree.root);

        System.out.println();
        System.out.println("Post-order Traversal (Left -> Right -> Root)");
        tree.postOrder(tree.root);

        System.out.println();
        System.out.println("Height of Tree is " + tree.Height());
    }
}
