import java.util.*;

public class BinaryTrees2 {
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

        public static int calHeight(Node root){
            if(root==null){
                return 0;
            }
            int lh=calHeight(root.left);
            int rh=calHeight(root.right);
            int maxheight=Math.max(lh,rh)+1;
            return maxheight;
        }

        //Approach 1
        public static int diameter(Node root){    //O(n^2)
           if(root==null){
              return 0;
           }
           int ldiam=diameter(root.left);
           int lh=calHeight(root.left);
           int rdiam=diameter(root.right);
           int rh=calHeight(root.right);

           int selfDiam=lh+rh+1;

           return Math.max(selfDiam,Math.max(ldiam,rdiam));
        }

        //Approach 2
        static class Info{
            int diam;
            int ht;

            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }
        public static Info diameter2(Node root){  //O(n)
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo=diameter2(root.left);
            Info rightInfo=diameter2(root.right);

            int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+ rightInfo.ht+1);
            int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

            return new Info(diam,ht);
        }
    }

    public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }else if(node==null || subRoot==null ||node.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        boolean leftAns=isSubtree(root.left,subroot);
        boolean rightAns=isSubtree(root.right,subroot);

        return leftAns || rightAns;
    }

    public static void main(String[] args) { //o(n)
//        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        BinaryTree tree=new BinaryTree();
//        Node root=tree.buildTree(nodes);
        //System.out.println(tree.calHeight(root));
        //System.out.println(tree.diameter(root));

        //System.out.println(tree.diameter2(root).diam);

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);

        System.out.println(isSubtree(root,subroot));
    }

}
