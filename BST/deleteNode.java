import java.util.*;
public class deleteNode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

public static void inorder(Node root){
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}

public static Node insert(Node root, int value){
    if(root==null){
        root = new Node(value);
            return root;
        
    }
    
    if(root.data>value){
        root.left = insert(root.left,value);
    }
    else{
        root.right = insert(root.right,value);

    }
    return root;
}

public static Node delete(Node root , int val){
    if(root.data<val){
        root.right = delete(root.right,val);
    }

    else if(root.data>val){
        root.left = delete(root.left,val);
    }

    else{
        //case 1 - leaf node

        if(root.left == null && root.right ==null){
            return null;
        }

        //case 2 - single child

        if(root.left ==null){
            return root.right;
        }
        else if(root.right ==null){
            return root.left;
        }

        //case 3 - both children

        Node IS = findInorderSuccessor(root.right);
        root.data = IS.data;
        root.right = delete(root.right  , IS.data);
    }
    return root;
}


public static Node findInorderSuccessor(Node root){
    /* inorder success is left most node in right subtree
    and it always has 0 or 1 child */
    while(root.left!=null){
        root = root.left;
    }
    return root;
}

public static void main(String[] args) {
    int values[] = {2,5,4,1,3,6,10,9,7,8};
    Node root = null;

    for(int i=0; i<values.length;i++){
        root = insert(root,values[i]);
    }
    inorder(root);
    System.out.println();

    root = delete(root,1);
    System.out.println();

    inorder(root);
}
}
