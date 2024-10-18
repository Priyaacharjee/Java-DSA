//import java.util.LinkedList;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
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
        newnode.prev=tail;
        tail=newnode;
    }
    //remove-last
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    public int removeLast(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //reverse dll
    public void reverse(){
       Node curr=head;
       Node prev=null;
       Node next;
       while(curr!=null){
           next=curr.next;
           curr.next=prev;
           curr.prev=next;
           prev=curr;
           curr=next;
       }
       head=prev;
    }

    public static void main(String[] args) {

      DoubleLL dll=new DoubleLL();

      dll.addFirst(1);
      dll.addFirst(2);
      dll.addFirst(3);
      dll.addFirst(4);
      dll.addLast(5);
      dll.addLast(6);
      dll.print();
      dll.reverse();
      dll.print();
      System.out.println(size);
//      dll.removeFirst();
//      dll.removeLast();
//      dll.print();
//      System.out.println(size);






        //-----------------------------------------JCF---------------------------
        //create
//        LinkedList<Integer> ll= new LinkedList<>();
//
//        //add
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(3);
//        ll.addFirst(0);
//        System.out.println(ll);
//        //remove
//        ll.removeLast();
//        ll.removeFirst();
//        System.out.println(ll);
    }
}
