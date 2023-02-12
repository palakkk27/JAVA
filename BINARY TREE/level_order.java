import java.util.*;

import javax.sound.sampled.DataLine.Info;
public class level_order {

    //nodes initialisation
    static class Node{ 
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;;
            this.left = null;
            this.right = null;
        }
    }

    // binary tree creation
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
    
// //level order 
//     public static void levelOrder(Node root) {
//         //base case
//         if(root == null){ 
//             return;
//         }
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);
    

//         while(!q.isEmpty()){
//             Node currnode = q.remove();
//             if(currnode == null){
//                 System.out.println();
//                 if(q.isEmpty()){
//                     break;
//                 } else{
//                     q.add(null);
//             }
//         } else{
//             System.out.print(currnode.data + " ");
//             if(currnode.left != null){
//                 q.add(currnode.left);
//             }
//             if(currnode.right != null){
//                 q.add(currnode.right);
//             }
//         }
//     }   
// }

//top view
        public static void topview(Node root){
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer,Node> map = new HashMap<>();

            int min = 0, max=0;

            q.add(new Info(root,0));
            q.add(null);

            while(!q.isEmpty()){
                Info curr = q.remove();
                if(curr==null){
                    // System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }

                else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }


            }       
                
            }
        }

}
public static void main(String[] args) {
    int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    BinaryTree  tree = new BinaryTree();
    Node root = tree.build_tree(nodes);
    tree.levelOrder(root);
}

}
