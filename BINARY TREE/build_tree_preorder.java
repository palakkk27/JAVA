import java.util.*;

public class build_tree_preorder{
    static  class Node{
    int data;
    Node left;
    Node right;


    Node(int data){
            this.data = data;
            this.left =  null;
            this.right =  null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static Node build_tree(int nodes[]) {
            index++;

            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = build_tree(nodes);        
            newNode.right = build_tree(nodes);    
            
            return newNode;
        }
    }


    public static void main(String[] args) {
    
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.build_tree(nodes);
        System.out.println(root.data);
    }
}