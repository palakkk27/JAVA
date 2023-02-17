import java.util.*;

public class validBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node insert(Node root, int value)
    {
        if(root == null)
        {
            root = new Node(value);
            return root;
        }

        if(root.data > value)
        {
            root.left = insert(root.left, value);
        }
        else 
        {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static boolean isValidBST(Node root, Node min, Node max)
    {
        if(root == null)
        {
            return true;
        }
        if(min != null && root.data <= min.data)
        {
            return false;
        }
        if(max != null && root.data >= max.data)
        {
            return false;
        }

        return isValidBST(root.left, min, root)
            && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int value[] = {2,5,4,1,3,6,10,9,7,8};
        Node root = null;
        
        for(int i=0; i<value.length; i++)
        {
            root = insert(root, value[i]);
        }

        inorder(root);
        System.out.println();

        if(isValidBST(root, null, null))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}