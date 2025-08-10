import java.util.*;

public class BinaryTrees {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
           idx++;
           if(nodes[idx]==-1){
               return null;
           }

           Node newNode =new Node(nodes[idx]);
           newNode.left=buildTree(nodes);
           newNode.right=buildTree(nodes);

           return newNode;
        }

        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

        }

        //level order traversal
        public static void levelorder(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null); //because the null got printed on next level also
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int calHeight(Node root){
            if(root==null){
                return 0;
            }
            int lh=calHeight(root.left);
            int rh=calHeight(root.right);
            int maxheight=Math.max(lh,rh)+1;
            return maxheight;
        }

        public static int countNodes(Node root){
            if(root==null){
                return 0;
            }
            int lcount=countNodes(root.left);
            int rcount=countNodes(root.right);
            int treecount=lcount+rcount+1;
            return treecount;
        }

        public static int sumofNodes(Node root){
            if(root==null){
                return 0;
            }
            int lsum=sumofNodes(root.left);
            int rsum=sumofNodes(root.right);
            int totsum=lsum+rsum+root.data;
            return totsum;
        }
    }
    public static void main(String[] args) { //o(n)
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
       // System.out.print(root.data);

       // tree.preorder(root);
        //tree.inorder(root);
        //tree.postorder(root);
        //tree.levelorder(root);
        System.out.println(tree.calHeight(root));
        System.out.println(tree.countNodes(root));
        System.out.println(tree.sumofNodes(root));
    }
}
