import java.util.*;
public class Linked_list {
     public static class Node{
         int data;
         Node next;

         public Node(int data) {
             this.data = data;
             this.next = null;
         }
     }

     public static Node head;
     public static Node tail;
     public static int size;

     public void addFirst(int data){
         Node newnode=new Node(data);
         size++;
         if(head==null){
             head=tail=newnode;
             return;
         }
         newnode.next=head;
         head=newnode;
     }

     public void addLast(int data){
         Node newnode=new Node(data);
         size++;
         if(head==null){
             head=tail=newnode;
             return;
         }
         tail.next=newnode;
         newnode.next=null;
         tail=newnode;
     }

     public void printll(){
         if(head==null){
             System.out.println("LL is empty.");
             return;
         }
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+"-->");
             temp=temp.next;
         }
         //System.out.print("\b\b\b");
         System.out.println("null");
     }

     public void addMiddle(int index,int data){
         if(index==0){
             addFirst(data);
             return;
         }
         Node newnode=new Node(data);
         size++;
         Node temp=head;
         int i=0;
         while(i<(index-1)){
             temp=temp.next;
             i++;
         }
         newnode.next=temp.next;
         temp.next=newnode;
     }

     public int removeFirst(){
         if(size==0){
             System.out.println("LL is empty");
             return Integer.MIN_VALUE;
         }else if(size==1){
             int val=head.data;
             head=tail=null;
             size=0;
             return val;
         }
         int val=head.data;
         head=head.next;
         size--;
         return val;
     }

     public int removeLast(){
         if(size==0){
             System.out.println("LL is empty");
             return Integer.MIN_VALUE;
         }else if(size==1){
             int val=head.data;
             head=tail=null;
             size=0;
             return val;
         }
         Node prev=head;
         for(int i=0;i<size-2;i++){
             prev=prev.next;
         }
         int val=prev.next.data;
         //System.out.println(val);
         prev.next=null;
         tail=prev;
         size--;
         return val;
     }

     public int search(int key){    //O(n)
         Node temp=head;
         int i=0;
         while(temp!=null){
             if(temp.data==key){
                 return i;
             }
             temp=temp.next;
             i++;
         }
         return -1;
     }

     public int searchRec(int key){
         return helper(head,key);

     }
     public int helper(Node head,int key){
         if(head == null){
             return -1;
         }
         if(head.data==key){
             return 0;
         }
         int idx=helper(head.next,key);
         if(idx==-1){
             return -1;
         }
         return idx+1;
     }

     public void reversell(){
         Node prev=null;
         Node curr=tail=head;
         Node next;
         while(curr!=null){
             next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
         }
         head=prev;
     }

     public void delNthfromend(int n){
          //calculate size
         int sz=0;
          Node temp=head;
          while(temp!= null){
              temp=temp.next;
              sz++;
          }
          if(n==sz){
              head=head.next;
              return;
          }

          //sz-n
         int i=1;
          int  idx=sz-n;
          Node prev=head;
          while(i<idx){
              prev=prev.next;
              i++;
          }
          prev.next=prev.next.next;
          return;
     }

     //check if a ll is palindrome

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next;  //+2
        }
        return slow;
    }

      public boolean checkpalindrome(){
          if(head==null || head.next==null){
              return true;
          }
          //step 1 - find mid
          Node midNode=findMid(head);

          //step 2 --reverse 2nd half
          Node prev=null;
          Node curr=midNode;
          Node next;
          while(curr!=null){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
          }

          Node right=prev;  //right half head
          Node left = head;

          //  step 3 -- check left half & right half
          while(right!=null){
              if(left.data != right.data){
                  return false;
              }
              left=left.next;
              right=right.next;
          }
          return true;
      }


    public static void main(String[] args) {
         Linked_list ll=new Linked_list();
         //ll.printll();
         ll.addFirst(1);
         ll.addLast(2);
         ll.addLast(1);
         //ll.addLast(1);
        // ll.addMiddle(2,3);
         ll.printll();
       // System.out.println(ll.size);
       // System.out.println(ll);

//        ll.removeFirst();
//        ll.printll();
//
//        ll.removeLast();
//        ll.printll();

//        System.out.println(ll.search(3));
//        System.out.println(ll.search(7));

//        System.out.println(ll.searchRec(3));
//        System.out.println(ll.searchRec(10));

//          ll.reversell();
//          ll.printll();
        //System.out.println(ll.size);
//        ll.delNthfromend(3);
//        ll.printll();

        System.out.println(ll.checkpalindrome());

     }

}
